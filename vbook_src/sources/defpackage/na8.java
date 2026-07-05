package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: na8  reason: default package */
/* loaded from: classes3.dex */
public final class na8 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pa8 c;
    public final /* synthetic */ gn8 d;
    public final /* synthetic */ cs9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na8(pa8 pa8Var, gn8 gn8Var, cs9 cs9Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = pa8Var;
        this.d = gn8Var;
        this.e = cs9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new na8(this.c, this.d, this.e, m42Var, 0);
            case 1:
                return new na8(this.c, this.d, this.e, m42Var, 1);
            case 2:
                return new na8(this.c, this.d, this.e, m42Var, 2);
            case 3:
                return new na8(this.c, this.d, this.e, m42Var, 3);
            case 4:
                return new na8(this.c, this.d, this.e, m42Var, 4);
            case 5:
                return new na8(this.c, this.d, this.e, m42Var, 5);
            default:
                return new na8(this.c, this.d, this.e, m42Var, 6);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((na8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((na8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((na8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((na8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((na8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((na8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((na8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x03e3, code lost:
        if (r14 != 3) goto L216;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0388 A[LOOP:0: B:168:0x0382->B:170:0x0388, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x045a  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
