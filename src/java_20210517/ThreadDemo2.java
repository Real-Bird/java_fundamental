package java_20210517;
//강사님 github 복사본
import java.awt.FlowLayout;


import javax.swing.JFrame;
import javax.swing.JProgressBar;
 
class JProgressDemo extends JFrame{
    JProgressBar progress1;
    JProgressBar progress2;
    JProgressBar progress3;
    JProgressBar progress4;
    JProgressBar progress5;
    public JProgressDemo() {
    	
        setLayout(new FlowLayout());// 배치관리자 설정
        progress1 = new JProgressBar();
        progress2 = new JProgressBar();
        progress3 = new JProgressBar();
        progress4 = new JProgressBar();
        progress5 = new JProgressBar();
        // 최소값이 0,최대값이 100까지 표시
        // progress.setValue(0);//0부터 시작.시작 지점값을
        // 표시
        progress1.setStringPainted(true);
        progress2.setStringPainted(true);
        progress3.setStringPainted(true);
        progress4.setStringPainted(true);
        progress5.setStringPainted(true);
        // true로 설정하면 현재 진행상황을 %로 표시함.
        add(progress1);// 스윙 프레임윈도우에 프로그래스바
        add(progress2);// 스윙 프레임윈도우에 프로그래스바
        add(progress3);// 스윙 프레임윈도우에 프로그래스바
        add(progress4);// 스윙 프레임윈도우에 프로그래스바
        add(progress5);// 스윙 프레임윈도우에 프로그래스바
        // 배치
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
        
        // 호출
    }// 생성자 정의
    
    
}

public class ThreadDemo2 extends Thread{
	JProgressBar jpb;
	public ThreadDemo2(JProgressBar jpb) {
		this.jpb = jpb;
	}
	public void run() {
		int i;
        try {
            for (i = 0; i <= 100; i++) {
            	jpb.setValue(i);
                Thread.sleep((int)(Math.random()*100));// 밀리세컨드 단위로
                // 지연시간을 설정.
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    	
    }
    
	public static void main(String[] args) {
		JProgressDemo t1 = new JProgressDemo();// 생성자를 호출
		ThreadDemo2 thread1 = new ThreadDemo2(t1.progress1);
		thread1.start();
		
		ThreadDemo2 thread2 = new ThreadDemo2(t1.progress2);
		thread2.start();
		
		ThreadDemo2 thread3 = new ThreadDemo2(t1.progress3);
		thread3.start();
		
		ThreadDemo2 thread4 = new ThreadDemo2(t1.progress4);
		thread4.start();
		
		ThreadDemo2 thread5 = new ThreadDemo2(t1.progress5);
		thread5.start();
    	
    }
	
}