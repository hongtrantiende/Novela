package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: atb  reason: default package */
/* loaded from: classes.dex */
public final class atb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ gtb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ atb(gtb gtbVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = gtbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        gtb gtbVar = this.c;
        switch (i) {
            case 0:
                atb atbVar = new atb(gtbVar, m42Var, 0);
                long j = ((y78) obj).a;
                return atbVar;
            case 1:
                return new atb(gtbVar, m42Var, 1);
            default:
                return new atb(gtbVar, m42Var, 2);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                long j = ((y78) obj).a;
                return new atb(this.c, (m42) obj2, 0).invokeSuspend(pvcVar);
            case 1:
                return ((atb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((atb) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x035f  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
