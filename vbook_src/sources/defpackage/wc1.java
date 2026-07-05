package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wc1  reason: default package */
/* loaded from: classes3.dex */
public abstract class wc1 {
    public static final /* synthetic */ int a = 0;

    static {
        int i;
        long j;
        long j2;
        long j3;
        sve.j(pg5.k, new v71(14), new c8(8, (byte) 0));
        ry5 ry5Var = new ry5(0, 255, 1);
        ArrayList arrayList = new ArrayList(tl1.s(ry5Var, 10));
        Iterator it = ry5Var.iterator();
        while (true) {
            sy5 sy5Var = (sy5) it;
            if (!sy5Var.c) {
                break;
            }
            int nextInt = sy5Var.nextInt();
            if (48 <= nextInt && nextInt < 58) {
                j = nextInt;
                j3 = 48;
            } else {
                j = nextInt;
                if (j >= 97 && j <= 102) {
                    j3 = 87;
                } else if (j >= 65 && j <= 70) {
                    j3 = 55;
                } else {
                    j2 = -1;
                    arrayList.add(Long.valueOf(j2));
                }
            }
            j2 = j - j3;
            arrayList.add(Long.valueOf(j2));
        }
        sl1.D0(arrayList);
        ry5 ry5Var2 = new ry5(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(tl1.s(ry5Var2, 10));
        Iterator it2 = ry5Var2.iterator();
        while (true) {
            sy5 sy5Var2 = (sy5) it2;
            if (sy5Var2.c) {
                int nextInt2 = sy5Var2.nextInt();
                if (nextInt2 < 10) {
                    i = nextInt2 + 48;
                } else {
                    i = (char) (((char) (nextInt2 + 97)) - '\n');
                }
                arrayList2.add(Byte.valueOf((byte) i));
            } else {
                sl1.x0(arrayList2);
                return;
            }
        }
    }

    public static final int a(int i, int i2, CharSequence charSequence) {
        charSequence.getClass();
        int i3 = 0;
        while (i < i2) {
            int charAt = charSequence.charAt(i);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            i3 = (i3 * 31) + charAt;
            i++;
        }
        return i3;
    }

    public static final void b(tb1 tb1Var, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) tb1Var) + ", wrong digit: " + tb1Var.charAt(i) + " at position " + i);
    }
}
