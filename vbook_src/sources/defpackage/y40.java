package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y40  reason: default package */
/* loaded from: classes3.dex */
public final class y40 {
    public static final y40 a = new Object();
    public static final gm9 b = new gm9("(\\[[a-zA-Z]+]|\\.\\.\\.|[.,!?।])");
    public static final gm9 c = new gm9("\\[[a-zA-Z]+]");

    public static final void b(StringBuilder sb, ArrayList arrayList, zl9 zl9Var, int i) {
        String obj = k4b.N0(sb.toString()).toString();
        sb.setLength(0);
        if (obj.length() > 0 && !c.g(obj)) {
            arrayList.add(new w40(obj, (v40) zl9Var.a, 0));
        }
        if (i > 0 && !arrayList.isEmpty()) {
            arrayList.add(new w40("", (v40) zl9Var.a, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r10.equals("।") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
        if (r10.equals(".") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
        r10 = org.mozilla.javascript.Context.VERSION_ECMASCRIPT;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b2  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v14, types: [nu4] */
    /* JADX WARN: Type inference failed for: r3v3, types: [zl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x021d -> B:104:0x0222). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, float r20, float r21, float r22, defpackage.ew8 r23, boolean r24, defpackage.n42 r25) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y40.a(java.lang.String, float, float, float, ew8, boolean, n42):java.lang.Object");
    }
}
