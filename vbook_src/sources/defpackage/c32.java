package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c32  reason: default package */
/* loaded from: classes3.dex */
public abstract class c32 {
    public static final e32 a;

    static {
        ks3 ks3Var = ks3.a;
        new e32("multipart", "*", ks3Var);
        new e32("multipart", "mixed", ks3Var);
        new e32("multipart", "alternative", ks3Var);
        new e32("multipart", "related", ks3Var);
        a = new e32("multipart", "form-data", ks3Var);
        new e32("multipart", "signed", ks3Var);
        new e32("multipart", "encrypted", ks3Var);
        new e32("multipart", "byteranges", ks3Var);
    }
}
