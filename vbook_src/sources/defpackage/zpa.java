package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zpa  reason: default package */
/* loaded from: classes3.dex */
public final class zpa extends fs9 implements lu4 {
    public /* synthetic */ Object C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Iterator F;
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpa(int i, int i2, Iterator it, m42 m42Var) {
        super(2, m42Var);
        this.D = i;
        this.E = i2;
        this.F = it;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        zpa zpaVar = new zpa(this.D, this.E, this.F, m42Var);
        zpaVar.C = obj;
        return zpaVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((zpa) create((c9a) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0140 A[SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
