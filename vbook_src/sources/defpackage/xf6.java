package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xf6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf6 extends r89 implements p76 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf6(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // defpackage.l51
    public final u66 computeReflected() {
        cm9.a.getClass();
        return this;
    }

    @Override // defpackage.p76
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((yya) this.receiver).getValue();
            case 1:
                return ((yya) this.receiver).getValue();
            case 2:
                return ((yya) this.receiver).getValue();
            case 3:
                return ((yya) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        return get();
    }
}
