package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k91  reason: default package */
/* loaded from: classes3.dex */
public final class k91 extends zo0 {
    public static final String q(k91 k91Var, byte[] bArr) {
        if (bArr.length >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) {
            return "jpg";
        }
        if (bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) {
            return "png";
        }
        if (bArr.length >= 6 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) {
            return "gif";
        }
        if (bArr.length >= 12 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80) {
            return "webp";
        }
        return "bin";
    }

    public static final List r(k91 k91Var, String str) {
        k91Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ef4 ef4Var = new ef4(new ff4(new ki4(3, gm9.c(new gm9("\"([^\"]+)\""), str), new v71(6)), true, new v71(7)));
        while (ef4Var.hasNext()) {
            linkedHashSet.add((String) ef4Var.next());
        }
        sw4 sw4Var = new sw4(gm9.c(new gm9(fca.B(hm9.IGNORE_CASE)), str));
        while (sw4Var.hasNext()) {
            linkedHashSet.add(((z17) ((b27) sw4Var.next()).a()).get(1));
        }
        return sl1.C0(linkedHashSet);
    }
}
