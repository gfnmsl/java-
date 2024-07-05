public class 公交车计数案例 {
  /**
   * 要求:
   * 刚开始公交车上没有人
   * 到达第一站 上车有一人上车
   * 到达第二站 上车两人 下车一人
   * 到达第三站 上车两人 下车一人
   * 到达第四站 下车一位
   * 到达第五站 上来一位
   * 
   */

  // 程序主入口
  public static void main(String[] args) {
    int Bus = 0;// 最开始公交车的人数
    System.out.println("公交车发车了,当前车内有" + Bus + "人");// 输出语句

    Bus = Bus + 1;// 变量自增 1
    System.out.println("到达第一站了,当前车内有" + Bus + "人");

    Bus = Bus + 2 - 1;// 变量自增 2 并 自减 1
    System.out.println("到达第二站了,当前车内有" + Bus + "人");

    Bus = Bus + 2 - 1;// 变量自增 2 并 自减 1
    System.out.println("到达第三站了,当前车内有" + Bus + "人");

    Bus = Bus - 1;// 变量自减 1
    System.out.println("到达第四站了,当前车内有" + Bus + "人");

    Bus = Bus + 1;// 变量自增 1
    System.out.println("到达第五站了,当前车内有" + Bus + "人");

    System.out.println("到达终点了,当前车内有" + Bus + "人");
  }
}