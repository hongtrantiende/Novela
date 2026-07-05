package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: du2  reason: default package */
/* loaded from: classes.dex */
public final class du2 {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public abf a;
    public boolean b;
    public int c;

    public static void a(int i, ArrayList arrayList) {
        if (hc2.n(i, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public vq4 b(vq4 vq4Var) {
        String str;
        if (this.b && this.a.c(vq4Var)) {
            uq4 a = vq4Var.a();
            String str2 = vq4Var.k;
            a.n = lc7.p("application/x-media3-cues");
            a.L = this.a.h(vq4Var);
            StringBuilder sb = new StringBuilder();
            sb.append(vq4Var.o);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb.append(str);
            a.j = sb.toString();
            a.s = Long.MAX_VALUE;
            return new vq4(a);
        }
        return vq4Var;
    }
}
