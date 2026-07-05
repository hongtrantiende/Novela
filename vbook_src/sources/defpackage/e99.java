package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e99  reason: default package */
/* loaded from: classes.dex */
public final class e99 implements y3d {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public ac4 d;
    public final f78 e;

    public /* synthetic */ e99(f78 f78Var, int i) {
        this.a = i;
        this.e = f78Var;
    }

    @Override // defpackage.y3d
    public final y3d b(String str) {
        int i = this.a;
        f78 f78Var = this.e;
        switch (i) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((d99) f78Var).i(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.b) {
                    this.b = true;
                    ((g9e) f78Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override // defpackage.y3d
    public final y3d c(boolean z) {
        int i = this.a;
        f78 f78Var = this.e;
        switch (i) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((d99) f78Var).c(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.b) {
                    this.b = true;
                    ((g9e) f78Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
