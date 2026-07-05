package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c02  reason: default package */
/* loaded from: classes.dex */
public abstract class c02 {
    public static final wu7 a;

    static {
        zs9 zs9Var = wm1.e;
        int i = zs9Var.c;
        b02 b02Var = new b02(zs9Var, zs9Var, 1);
        int i2 = zs9Var.c;
        p98 p98Var = wm1.x;
        int i3 = (p98Var.c << 6) | i2;
        b02 b02Var2 = new b02(zs9Var, p98Var, 0);
        int i4 = (i2 << 6) | p98Var.c;
        b02 b02Var3 = new b02(p98Var, zs9Var, 0);
        wu7 wu7Var = oy5.a;
        wu7 wu7Var2 = new wu7();
        wu7Var2.i(i | (i << 6), b02Var);
        wu7Var2.i(i3, b02Var2);
        wu7Var2.i(i4, b02Var3);
        a = wu7Var2;
    }
}
