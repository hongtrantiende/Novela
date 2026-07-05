package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: af8  reason: default package */
/* loaded from: classes3.dex */
public abstract class af8 {
    public static final ly1 a = new ly1(new sc8(8));
    public static final ty5 b = new ry5(1, 3999, 1);
    public static final List c = tl1.B(new yk8(1000, "m"), new yk8(900, "cm"), new yk8(500, "d"), new yk8(400, "cd"), new yk8(100, "c"), new yk8(90, "xc"), new yk8(50, "l"), new yk8(40, "xl"), new yk8(10, "x"), new yk8(9, "ix"), new yk8(5, "v"), new yk8(4, "iv"), new yk8(1, "i"));

    public static final cf8 a(List list) {
        bf8 bf8Var;
        int i;
        list.getClass();
        if (list.isEmpty()) {
            return cf8.b;
        }
        bf8[] bf8VarArr = new bf8[6];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xl0 xl0Var = (xl0) it.next();
            if (!xl0Var.b.a()) {
                for (int i2 = 0; i2 < 6; i2++) {
                    bf8VarArr[i2] = null;
                }
            } else {
                int i3 = xl0Var.d.a;
                if (i3 <= 5) {
                    int i4 = i3;
                    while (true) {
                        bf8VarArr[i4] = null;
                        if (i4 == 5) {
                            break;
                        }
                        i4++;
                    }
                }
                if (xl0Var.b instanceof dn0) {
                    if (i3 != 0) {
                        for (int i5 = i3 - 1; -1 < i5; i5--) {
                            bf8Var = bf8VarArr[i5];
                            if (bf8Var != null) {
                                break;
                            }
                        }
                    }
                    bf8Var = null;
                    if (bf8Var == null) {
                        i = -1;
                    } else {
                        i = ze8.a[bf8Var.ordinal()];
                    }
                    bf8 bf8Var2 = bf8.a;
                    if (i != -1) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    xk5.o();
                                    return null;
                                }
                            } else {
                                bf8Var2 = bf8.c;
                            }
                        } else {
                            bf8Var2 = bf8.b;
                        }
                    }
                    linkedHashMap.put(new pm0(xl0Var.a), bf8Var2);
                    bf8VarArr[i3] = bf8Var2;
                } else {
                    continue;
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return cf8.b;
        }
        return new cf8(o17.y(linkedHashMap));
    }
}
