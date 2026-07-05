package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jpc  reason: default package */
/* loaded from: classes3.dex */
public final class jpc {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[LOOP_START, PHI: r4 
      PHI: (r4v7 int) = (r4v1 int), (r4v8 int) binds: [B:70:0x003b, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(int r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpc.a(int, java.lang.String, boolean, boolean):java.util.ArrayList");
    }

    public static final List b(ArrayList arrayList, int i, int i2) {
        uyb uybVar;
        if (i > 0 && arrayList.size() >= 2) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            loop0: while (true) {
                uybVar = null;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    uyb uybVar2 = (uyb) obj;
                    if (uybVar != null) {
                        if (uybVar2.c - uybVar.b <= i2) {
                            uybVar2 = d(uybVar, uybVar2);
                        } else {
                            arrayList2.add(uybVar);
                        }
                    }
                    uybVar = uybVar2;
                    String str = uybVar.a;
                    int i4 = 0;
                    for (int i5 = 0; i5 < str.length(); i5++) {
                        if (Character.isLetterOrDigit(str.charAt(i5))) {
                            i4++;
                        }
                    }
                    if (i4 >= i) {
                        break;
                    }
                }
                arrayList2.add(uybVar);
            }
            if (uybVar != null) {
                if (!arrayList2.isEmpty() && uybVar.c - ((uyb) sl1.j0(arrayList2)).b <= i2) {
                    Object removeLast = arrayList2.removeLast();
                    removeLast.getClass();
                    arrayList2.add(d((uyb) removeLast, uybVar));
                    return arrayList2;
                }
                arrayList2.add(uybVar);
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static boolean c(char c) {
        if (c != '!' && c != '.' && c != '?' && c != 8230 && c != 12290 && c != 65281 && c != 65311) {
            return false;
        }
        return true;
    }

    public static final uyb d(uyb uybVar, uyb uybVar2) {
        return new uyb(eub.o(uybVar.a, " ", uybVar2.a), uybVar.b, uybVar2.c);
    }
}
