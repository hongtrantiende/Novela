package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jd3  reason: default package */
/* loaded from: classes3.dex */
public final class jd3 extends ue4 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd3(String str, ii2 ii2Var, int i) {
        super(str, ii2Var);
        this.d = i;
    }

    @Override // defpackage.dyb
    public final hyb f() {
        switch (this.d) {
            case 0:
                return new hyb("docx", "docx", ls3.a, false, false);
            case 1:
                return new hyb("fb2", "fb2", ls3.a, false, false);
            case 2:
                return new hyb("html", "html", ls3.a, false, false);
            case 3:
                return new hyb("mobi", "mobi", ls3.a, false, false);
            case 4:
                return new hyb("umd", "umd", ls3.a, false, false);
            default:
                return new hyb("zip", "zip", ls3.a, false, false);
        }
    }
}
