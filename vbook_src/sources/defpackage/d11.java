package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d11  reason: default package */
/* loaded from: classes3.dex */
public final class d11 implements c11 {
    public final f61 b;
    public final Throwable c;

    public d11(f61 f61Var) {
        this.b = f61Var;
        String property = System.getProperty("io.ktor.development");
        if (property != null && Boolean.parseBoolean(property)) {
            int hashCode = f61Var.hashCode();
            nqe.u(16);
            String num = Integer.toString(hashCode, 16);
            num.getClass();
            Throwable th = new Throwable("WriteTask 0x".concat(num));
            pye.s(th);
            this.c = th;
        }
    }

    @Override // defpackage.c11
    public final Throwable c() {
        return this.c;
    }

    @Override // defpackage.c11
    public final m42 d() {
        return this.b;
    }
}
