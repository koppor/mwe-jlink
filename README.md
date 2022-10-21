# MWE

The file `Hello.java` is used to "harvest" the ByteCode to be generate for https://github.com/openjdk/jdk/pull/10704.

    javap -c Hello.class

```
Compiled from "Hello.java"
class Hello {
  Hello();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public void method0(java.lang.module.ModuleDescriptor[]);
    Code:
       0: aload_1
       1: iconst_0
       2: aconst_null
       3: aastore
       4: aload_1
       5: astore_2
       6: aload_2
       7: iconst_1
       8: aconst_null
       9: aastore
      10: return

  public void method1(java.lang.module.ModuleDescriptor[]);
    Code:
       0: aload_1
       1: iconst_1
       2: aconst_null
       3: aastore
       4: return

  public void method2();
    Code:
       0: return

  public java.lang.module.ModuleDescriptor[] moduleDescriptors();
    Code:
       0: bipush        10
       2: anewarray     #7                  // class java/lang/module/ModuleDescriptor
       5: astore_1
       6: aload_0
       7: aload_1
       8: invokevirtual #9                  // Method method0:([Ljava/lang/module/ModuleDescriptor;)V
      11: aload_0
      12: aload_1
      13: invokevirtual #15                 // Method method1:([Ljava/lang/module/ModuleDescriptor;)V
      16: aload_0
      17: invokevirtual #18                 // Method method2:()V
      20: aload_1
      21: areturn

  public void updateArray(java.lang.Object[]);
    Code:
       0: aload_1
       1: iconst_0
       2: ldc           #21                 // String NEW CONTENT
       4: aastore
       5: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #10                 // class Hello
       3: dup
       4: invokespecial #23                 // Method "<init>":()V
       7: astore_1
       8: aload_1
       9: invokevirtual #24                 // Method moduleDescriptors:()[Ljava/lang/module/ModuleDescriptor;
      12: astore_2
      13: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
      16: aload_2
      17: iconst_0
      18: aaload
      19: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      22: iconst_2
      23: anewarray     #2                  // class java/lang/Object
      26: astore_3
      27: aload_1
      28: aload_3
      29: invokevirtual #40                 // Method updateArray:([Ljava/lang/Object;)V
      32: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
      35: aload_3
      36: iconst_0
      37: aaload
      38: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      41: return
}
```
