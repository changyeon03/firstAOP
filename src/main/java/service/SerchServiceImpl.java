package service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class SerchServiceImpl implements SearchService {
    //List와 key생성
    List<Integer> list = new LinkedList<>();
    Integer key = 8080;

    @Override
    public void BinarySearch()
    {
        for(int i = 0; i<=10000; i++) {
            list.add(i);
        }
        int index = Collections.binarySearch(list, key);
        if (index>=0){
            System.out.println("값을 찾았습니다.");
        }
        else{
            System.out.println("값을 찾지 못했습니다.");
        }
    }

    @Override
    public void SequentialSearch() {
        for(int i = 0; i<=10000; i++) {
            list.add(i);
        }
        if(list.indexOf(key)!=-1){
            System.out.println("값을 찾았습니다.");
        }
        else {
            System.out.println("갑슬 찾지 못했습니다.");
        }
    }

    @Override
    public void NPEtest() {
        String s = null;
        boolean isA = s.equals("A");
        System.out.println("s는 A인가?" + isA);
    }
}
