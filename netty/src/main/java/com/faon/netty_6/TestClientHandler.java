package com.faon.netty_6;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

public class TestClientHandler extends SimpleChannelInboundHandler<MyDataInfo.MyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MyDataInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        int randomInt = new Random().nextInt(3);
        MyDataInfo.MyMessage message=null;
        if (randomInt == 0){
            message = MyDataInfo.MyMessage.newBuilder().
                    setDataType(MyDataInfo.MyMessage.DataType.personType).
                    setPerson(MyDataInfo.Person.newBuilder().setName("张三").
                            setAge(25).setAddress("深圳").build()).
                    build();
        }else if (randomInt == 1){
            message = MyDataInfo.MyMessage.newBuilder().
                    setDataType(MyDataInfo.MyMessage.DataType.dogType).
                    setDog(MyDataInfo.Dog.newBuilder().setName("大黄").
                            setBrand("金毛").build()).
                    build();
        }else {
            message = MyDataInfo.MyMessage.newBuilder().
                    setDataType(MyDataInfo.MyMessage.DataType.catType).
                    setCat(MyDataInfo.Cat.newBuilder().setName("小米").
                            setColor("黑白相间").build()).
                    build();
        }
        System.out.println(message);
        ctx.channel().writeAndFlush(message);
    }
}
