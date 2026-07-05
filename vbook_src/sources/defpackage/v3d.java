package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v3d  reason: default package */
/* loaded from: classes.dex */
public abstract class v3d {
    public static final p88 a = new p88(i88.a, 0, 0);

    public static final ikc a(ted tedVar, ps psVar) {
        ikc a2 = tedVar.a(psVar);
        int length = psVar.b.length();
        ps psVar2 = a2.a;
        j88 j88Var = a2.b;
        int length2 = psVar2.b.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            b(j88Var.w(i), length2, i);
        }
        b(j88Var.w(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            c(j88Var.d(i2), length, i2);
        }
        c(j88Var.d(length2), length, length2);
        return new ikc(psVar2, new p88(j88Var, psVar.b.length(), psVar2.b.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z) {
            StringBuilder r = hl5.r(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
            r.append(i2);
            r.append("]");
            ov5.c(r.toString());
        }
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z) {
            StringBuilder r = hl5.r(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
            r.append(i2);
            r.append("]");
            ov5.c(r.toString());
        }
    }
}
