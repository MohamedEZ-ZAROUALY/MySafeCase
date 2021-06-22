package com.proj;

import java.io.File;
import java.nio.file.*;
import java.io.FileInputStream;
import java.io.IOException;

public class CypherBot {
    private File O_f,F_f;
    private Path O_p,F_p;
    private int key,blocklenght;
    private String metadata;
    private byte[] Block;

    /*public static void main(String[] args)throws IOException{
        CypherBot c = new CypherBot("crypted.txt","this.txt");
        c.cypher();
    }*/

    public boolean cypher() throws IOException{
        long N=O_f.length();
        F_f.createNewFile();
        FileInputStream inp = null;
        inp=new FileInputStream(O_f);
        Block =new byte[(int)N];
        inp.read(Block);;
        inp.close();
        for(int i=0;i<N;i++){
            Block[i]=(byte)~Block[i];
        }
        Files.write(F_p, Block);
        return true;
    }

    public Path   getSourcePath(){return O_p;}
    public Path   getdestinationPath(){return F_p;}
    public File   getSourceFile(){return O_f;}
    public File   getDestinationFile(){return F_f;}
    public String getSourcePathString(){return O_f.getPath();}
    public String getdestinationPathString(){return F_f.getPath();}
    public int    getKey(){return key;}
    public int    getBlockLenght(){return blocklenght;}
    public String getMeta(){return metadata;}

    public void setSourceFile(File f){
        O_f=new File(f.getPath());
        O_p=f.toPath();
    }
    public void setDestinationFile(File f){
        F_f=new File(f.getPath());
        F_p=f.toPath();
    }
    public void setSourceFile(String filePath){
        O_f=new File(filePath);
        O_p=O_f.toPath();
    }
    public void setDestinationFile(String filePath){
        F_f=new File(filePath);
        F_p=F_f.toPath();
    }
    public void setKey(int k){key=k;}
    public void setBlockLenght(int L){blocklenght=L;}

    CypherBot(){
        O_f = new File("C:/of");
        F_f = new File("C:/ff");
        O_p = O_f.toPath();
        F_p = F_f.toPath();
        key = 0;
        blocklenght = 64;
        Block = new byte[blocklenght];
        metadata = new String();
    }
    CypherBot(File f){
        O_f = new File(f.getPath());
        O_p = O_f.toPath();
        F_f = O_f.getParentFile();
        F_p = F_f.toPath();
        key = 0;
        blocklenght = 64;
        Block = new byte[blocklenght];
        metadata = new String();
    }
    CypherBot(File sourceFile,File destinationFile){
        O_f = new File(sourceFile.getPath());
        O_p = O_f.toPath();
        F_f = new File(destinationFile.getPath());
        F_p = F_f.toPath();
        key = 0;
        blocklenght = 64;
        Block = new byte[blocklenght];
        metadata = new String();
    }
    CypherBot(String pathstrString){
        O_f = new File(pathstrString);
        O_p = O_f.toPath();
        F_f = O_f.getParentFile();
        F_p = F_f.toPath();
        key = 0;
        blocklenght = 64;
        Block = new byte[blocklenght];
        metadata = new String();
    }
    CypherBot(String SourcepathstrString,String DestinationPathString){
        O_f = new File(SourcepathstrString);
        O_p = O_f.toPath();
        F_f = new File(DestinationPathString);
        F_p = F_f.toPath();
        key = 0;
        blocklenght = 64;
        Block = new byte[blocklenght];
        metadata = new String();
    }
    CypherBot(File f,int key,int blocksize){
        O_f = new File(f.getPath());
        O_p = O_f.toPath();
        F_f = O_f.getParentFile();
        F_p = F_f.toPath();
        this.key = key;
        blocklenght = blocksize;
        Block = new byte[blocklenght];
        metadata = new String();
    }
    CypherBot(File SourceFile,File DestinationFile,int key,int blocksize){
        O_f = new File(SourceFile.getPath());
        O_p = O_f.toPath();
        F_f = new File(DestinationFile.getPath());
        F_p = F_f.toPath();
        this.key = key;
        blocklenght = blocksize;
        Block = new byte[blocklenght];
        metadata = new String();
    }
} 