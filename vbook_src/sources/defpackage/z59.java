package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z59  reason: default package */
/* loaded from: classes3.dex */
public abstract class z59 {
    public static final r07 a;

    static {
        r07 r07Var = new r07();
        r07Var.put(cm9.a(String.class), c4b.a);
        r07Var.put(cm9.a(Character.TYPE), rc1.a);
        r07Var.put(cm9.a(char[].class), bc1.c);
        r07Var.put(cm9.a(Double.TYPE), bf3.a);
        r07Var.put(cm9.a(double[].class), oe3.c);
        r07Var.put(cm9.a(Float.TYPE), zi4.a);
        r07Var.put(cm9.a(float[].class), ti4.c);
        r07Var.put(cm9.a(Long.TYPE), ky6.a);
        r07Var.put(cm9.a(long[].class), vx6.c);
        r07Var.put(cm9.a(stc.class), wtc.a);
        r07Var.put(cm9.a(Integer.TYPE), xy5.a);
        r07Var.put(cm9.a(int[].class), gy5.c);
        r07Var.put(cm9.a(ntc.class), rtc.a);
        r07Var.put(cm9.a(Short.TYPE), lka.a);
        r07Var.put(cm9.a(short[].class), kka.c);
        r07Var.put(cm9.a(auc.class), euc.a);
        r07Var.put(cm9.a(Byte.TYPE), o21.a);
        r07Var.put(cm9.a(byte[].class), t01.c);
        r07Var.put(cm9.a(itc.class), mtc.a);
        r07Var.put(cm9.a(Boolean.TYPE), ms0.a);
        r07Var.put(cm9.a(boolean[].class), ks0.c);
        r07Var.put(cm9.a(pvc.class), rvc.b);
        r07Var.put(cm9.a(Void.class), i48.a);
        try {
            gi1 a2 = cm9.a(wl3.class);
            hq7 hq7Var = wl3.b;
            r07Var.put(a2, zl3.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            r07Var.put(cm9.a(ttc.class), vtc.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            r07Var.put(cm9.a(otc.class), qtc.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            r07Var.put(cm9.a(buc.class), duc.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            r07Var.put(cm9.a(jtc.class), ltc.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            r07Var.put(cm9.a(q2d.class), s2d.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            gi1 a3 = cm9.a(zx5.class);
            zx5 zx5Var = zx5.c;
            r07Var.put(a3, ey5.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        a = r07Var.b();
    }

    public static final void a(String str) {
        Iterator it = ((o81) a.values()).iterator();
        while (it.hasNext()) {
            s76 s76Var = (s76) it.next();
            if (str.equals(s76Var.e().a())) {
                StringBuilder o = a82.o("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                o.append(cm9.a(s76Var.getClass()).g());
                o.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                vs.m(l4b.y(o.toString()));
                return;
            }
        }
    }
}
