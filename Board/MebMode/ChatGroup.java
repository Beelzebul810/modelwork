package MebMode;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom{
    private Hashtable members=new Hashtable();

    @Override
    public void register(Member member) {
        if(!members.contains(member)){
            members.put(member.getName(),member);
            member.setChatroom(this);
        }
    }

    @Override
    public void sendText(String from,String to,String message) {
        Member member=(Member)members.get(to);                          //创建接受对象
        String newMessage=message;
        newMessage=newMessage.replaceAll("打","*");   //过滤信息中”打“
        member.receiveText(from,newMessage);                          //接受对象接受来自from的消息
    }
    @Override
    public void sendImage(String from,String to,String image) {
        Member member=(Member)members.get(to);
        if(image.length()>7){
            System.out.println("图片太大，无法发送");
        }else{
            member.receiveImage(from,image);
        }

    }
}
