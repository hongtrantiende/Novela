package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bif  reason: default package */
/* loaded from: classes.dex */
public final class bif extends c3e {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bif(int i) {
        super(13);
        this.b = i;
    }

    @Override // defpackage.c3e
    public final /* synthetic */ Object O() {
        switch (this.b) {
            case 0:
                return new dif();
            case 1:
                return new lif();
            case 2:
                return new zjf();
            default:
                return new gkf();
        }
    }
}
