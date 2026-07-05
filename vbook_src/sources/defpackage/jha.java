package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jha  reason: default package */
/* loaded from: classes.dex */
public final class jha extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iha b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jha(iha ihaVar, int i) {
        super(0);
        this.a = i;
        this.b = ihaVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        jga e;
        jga e2;
        int i = this.a;
        boolean z = false;
        iha ihaVar = this.b;
        switch (i) {
            case 0:
                kga kgaVar = (kga) ihaVar.c.getValue();
                if (kgaVar != null && (e = kgaVar.e()) != null) {
                    z = e.a();
                }
                return Boolean.valueOf(z);
            default:
                kga kgaVar2 = (kga) ihaVar.c.getValue();
                if (kgaVar2 != null && (e2 = kgaVar2.e()) != null) {
                    z = e2.a();
                }
                return Boolean.valueOf(z);
        }
    }
}
