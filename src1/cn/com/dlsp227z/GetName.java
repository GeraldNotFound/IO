package cn.com.dlsp227z;

import java.io.File;

// 本程序在改名的同时将目录的树状图输出
public class GetName
{
    /* 这两个变量用于给文件分级  */
    private static int level = 0;
    private static String levelStr;
    private static String fileName;

    public static void main(String[] args)
    {
        File file = new File("E:\\java测试\\新白娘子专辑");
        changeName(file, level);
    }

    public static void changeName(File file, int level)
    {
        /* 该部分用于给文件分级 */
        levelStr = "";
        for(int i = 0; i < level; i++)
            levelStr += "-";

        System.out.println(levelStr + file.getName());
        /* 出口条件file是文件而不是目录 */
        if(file.isFile())
        {
            /* 重命名之后，该file所对应的文件就没有了，故若先改名后判断isFile必为false */
            if(file.getName().contains("新白娘子传奇"))
            {
                fileName = file.getParent() + "\\" + file.getName().replaceAll("新白娘子传奇", " 新白娘子传奇1_呼哈呼哈呼哈");
                file.renameTo(new File(fileName));
            }
            return;
        }
        File[] subFile = file.listFiles();
        for(File f : subFile)
            changeName(f, level+1);
    }
}

