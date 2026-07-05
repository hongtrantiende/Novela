package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: et1  reason: default package */
/* loaded from: classes3.dex */
public final class et1 implements m42 {
    public static final et1 b = new et1(0);
    public static final et1 c = new et1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ et1(int i) {
        this.a = i;
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        int i = this.a;
        gs3 gs3Var = gs3.a;
        switch (i) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return gs3Var;
        }
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }

    private final void c(Object obj) {
    }
}
