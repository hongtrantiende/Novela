package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mm0  reason: default package */
/* loaded from: classes3.dex */
public final class mm0 extends fs9 implements lu4 {
    public final /* synthetic */ im0 C;
    public final /* synthetic */ im0 D;
    public final /* synthetic */ p6 E;
    public final /* synthetic */ jm0 F;
    public z09 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ hm0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm0(long j, hm0 hm0Var, im0 im0Var, im0 im0Var2, p6 p6Var, jm0 jm0Var, m42 m42Var) {
        super(2, m42Var);
        this.e = j;
        this.f = hm0Var;
        this.C = im0Var;
        this.D = im0Var2;
        this.E = p6Var;
        this.F = jm0Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        mm0 mm0Var = new mm0(this.e, this.f, this.C, this.D, this.E, this.F, m42Var);
        mm0Var.d = obj;
        return mm0Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((mm0) create((gab) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r14 == r12) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[Catch: CancellationException -> 0x0021, TryCatch #0 {CancellationException -> 0x0021, blocks: (B:7:0x001b, B:32:0x008e, B:34:0x0096, B:35:0x00a0, B:37:0x00a6, B:39:0x00b2, B:40:0x00b6, B:42:0x00bc, B:43:0x00c6, B:45:0x00cc, B:47:0x00d8, B:48:0x00dc, B:14:0x002d, B:24:0x005b, B:26:0x005f, B:29:0x0076, B:50:0x00e0, B:52:0x00e8, B:55:0x00ef, B:56:0x00f3, B:58:0x00f9, B:60:0x0105, B:62:0x0118, B:63:0x0122, B:65:0x0128, B:15:0x0032, B:21:0x0045, B:18:0x0039), top: B:70:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[Catch: CancellationException -> 0x0021, TryCatch #0 {CancellationException -> 0x0021, blocks: (B:7:0x001b, B:32:0x008e, B:34:0x0096, B:35:0x00a0, B:37:0x00a6, B:39:0x00b2, B:40:0x00b6, B:42:0x00bc, B:43:0x00c6, B:45:0x00cc, B:47:0x00d8, B:48:0x00dc, B:14:0x002d, B:24:0x005b, B:26:0x005f, B:29:0x0076, B:50:0x00e0, B:52:0x00e8, B:55:0x00ef, B:56:0x00f3, B:58:0x00f9, B:60:0x0105, B:62:0x0118, B:63:0x0122, B:65:0x0128, B:15:0x0032, B:21:0x0045, B:18:0x0039), top: B:70:0x0013 }] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
