package java_20210524.echo2.client2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EchoClientUI implements ActionListener {
	private String id;
	private String ip;
	private int port;
	private JFrame jframe;
	private JTextArea jta;
	private JTextField jtf;
	private JButton jbtn;
	private BufferedReader br;
	private BufferedWriter bw;

	public EchoClientUI(String id, String ip, int port) {
		this.id = id;
		this.ip = ip;
		this.port = port;

		jframe = new JFrame("Unicast Chatting");

		/**********************************************/
		/******************* 중앙시작 **********************/
		// text 영역 크기
		jta = new JTextArea("", 20, 50);
		// text 수정 불가
		jta.setEditable(false);
		// scroll bar 설정 / jframe에 jta를 바로 붙일 시 스크롤 바가 생기지 않음
		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setBackground(new Color(255, 204, 204));
		/******************* 중앙 끝 **********************/
		/******************* 하단시작 **********************/
		// text 입력 영역, 30글자 제한
		jtf = new JTextField(30);
		// 이벤트 설정 시 ActionListener 호출
		jtf.addActionListener(this);
		jbtn = new JButton("SEND");
		jbtn.addActionListener(this);

		JPanel j1 = new JPanel();
		j1.setLayout(new BorderLayout());
		j1.add(jtf, BorderLayout.CENTER);
		j1.add(jbtn, BorderLayout.EAST);
		/******************* 하단 끝 **********************/
		/******************* 상단시작 **********************/
		JLabel jl1 = new JLabel("User ID : [" + id + "]");
		JLabel jl2 = new JLabel("Server ip : " + ip);

		JPanel j2 = new JPanel();
		j2.setLayout(new BorderLayout());
		j2.add(jl1, BorderLayout.CENTER);
		j2.add(jl2, BorderLayout.EAST);
		j2.setBackground(new Color(244, 244, 204));
		/******************* 상단 끝 **********************/

		/**********************************************/
		/**********************************************/
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(j1, BorderLayout.SOUTH);
		jframe.add(j2, BorderLayout.NORTH);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jframe.pack();
		jframe.setResizable(true);
		jframe.setVisible(true);
	}

	public void connect() {
		try {
			Socket socket = new Socket(ip, port);
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(false);
		new EchoClientUI("Kim", "192.168.0.63", 3000).connect();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jtf) {
			// 텍스트 필드 입력 내용 가져오기
			String message = jtf.getText();
			try {
				bw.write(id + " : " + message);
				bw.newLine();
				bw.flush();
				
				String readLine = br.readLine();
				jta.append(readLine + "\r\n");
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			jtf.setText("");
			
		} else if (obj == jbtn) {
			String message = jtf.getText();
			try {
				bw.write(message);
				bw.newLine();
				bw.flush();
				
				String readLine = br.readLine();
				jta.append(readLine + "\r\n");
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			jtf.setText("");
		}
	}
}
