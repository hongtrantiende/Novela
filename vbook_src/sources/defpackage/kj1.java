package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kj1  reason: default package */
/* loaded from: classes3.dex */
public final class kj1 extends bj1 {
    public final /* synthetic */ int b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(oh5 oh5Var, String str, int i) {
        super(oh5Var, str);
        this.b = i;
        oh5Var.getClass();
        str.getClass();
        switch (i) {
            case 1:
                super(oh5Var, str);
                this.c = "Unhandled redirect: " + oh5Var.y0().c().getMethod().a + ' ' + oh5Var.y0().c().getUrl() + ". Status: " + oh5Var.e() + ". Text: \"" + str + '\"';
                return;
            case 2:
                super(oh5Var, str);
                this.c = "Server error(" + oh5Var.y0().c().getMethod().a + ' ' + oh5Var.y0().c().getUrl() + ": " + oh5Var.e() + ". Text: \"" + str + '\"';
                return;
            default:
                this.c = "Client request(" + oh5Var.y0().c().getMethod().a + ' ' + oh5Var.y0().c().getUrl() + ") invalid: " + oh5Var.e() + ". Text: \"" + str + '\"';
                return;
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.b) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            default:
                return this.c;
        }
    }
}
