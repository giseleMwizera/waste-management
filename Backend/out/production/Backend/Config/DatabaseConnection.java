����   < [
      java/lang/Object <init> ()V  com.mysql.jdbc.Driver	 
     Config/DatabaseConnection driver Ljava/lang/String;  Ejdbc:mysql://localhost:3306/waste_management?characterEncoding=latin1	 
    url  root	 
    username  
marv1nk@rs	 
    password	 
    ! 
connection Ljava/sql/Connection;	 
 # $ % 	statement Ljava/sql/Statement;	 
 ' ( ) data Ljava/sql/ResultSet;
 + , - . / java/lang/Class forName %(Ljava/lang/String;)Ljava/lang/Class;
 1 2 3 4 5 java/sql/DriverManager getConnection M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Connection; 7 8 9 : ; java/sql/Connection createStatement ()Ljava/sql/Statement; = java/lang/Exception ? @ A B C java/sql/Statement execute (Ljava/lang/String;)Z E java/sql/SQLException ? G H I executeQuery ((Ljava/lang/String;)Ljava/sql/ResultSet; Code LineNumberTable LocalVariableTable this LConfig/DatabaseConnection; StackMapTable createTable 	exception Ljava/sql/SQLException; insert insertStatement select selectStatement update updateStatement 
SourceFile DatabaseConnection.java ! 
                                 !     $ %     ( )        J   �     _*� *� 	*� *� *� *� *� "*� &*� 	� *W**� *� *� � 0� *� � **� � 6 � "� L�  + Z ] <  K   :       
     	  
 !  &  +  3  F  M  Z  ^  L       _ M N   O    � Z  
  B <   P C  J   n     *� "+� > W�M�      D  K              L        Q R     M N      :   O    M D  S C  J   n     *� "+� > W�M�      D  K       $  %  &  ' L        Q R     M N      T   O    M D  U I  J   w     **� "+� F � &*� &�M*� &�      D  K       -  .  /  0 L        Q R     M N      V   O    S D  W C  J   n     *� "+� > W�M�      D  K       6  7  8  9 L        Q R     M N      X   O    M D  Y    Z