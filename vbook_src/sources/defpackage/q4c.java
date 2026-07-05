package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q4c  reason: default package */
/* loaded from: classes3.dex */
public final class q4c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4c(int i, m42 m42Var, y5c y5cVar) {
        super(2, m42Var);
        this.a = 1;
        this.b = y5cVar;
        this.c = i;
    }

    private final Object o(Object obj) {
        boolean z;
        boolean z2;
        long b;
        final yrd yrdVar = (yrd) this.d;
        int i = this.c;
        az5 az5Var = null;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            long j = yrdVar.d;
            az5 az5Var2 = new az5(j);
            if (!eh.r(j)) {
                az5Var2 = null;
            }
            if (az5Var2 != null) {
                long j2 = az5Var2.a;
                long j3 = yrdVar.e;
                az5 az5Var3 = new az5(j3);
                if (eh.r(j3)) {
                    az5Var = az5Var3;
                }
                if (az5Var != null) {
                    long j4 = az5Var.a;
                    final float b2 = lz9.b(yrdVar.s.a);
                    akc akcVar = yrdVar.q;
                    final akc akcVar2 = yrdVar.r;
                    final long j5 = akcVar2.b;
                    long j6 = akcVar2.a;
                    float b3 = lz9.b(j6);
                    final sk9 sk9Var = yrdVar.D;
                    final float f = yrdVar.t;
                    final float f2 = yrdVar.v;
                    float k = yz1.k(new Integer(2).intValue(), b2);
                    float k2 = yz1.k(2, f2);
                    if (k >= yz1.k(2, f) && k <= k2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sk9Var.getClass();
                    float f3 = sk9Var.d;
                    float f4 = sk9Var.b;
                    float f5 = sk9Var.c;
                    if (z78.b(j5) - sk9Var.a >= -1.0f && z78.b(j5) - f5 < 1.0f && z78.c(j5) - f4 >= -1.0f && z78.c(j5) - f3 < 1.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z && z2) {
                        return Boolean.FALSE;
                    }
                    z78 z78Var = (z78) this.b;
                    if (z78Var != null) {
                        b = z78Var.a;
                    } else {
                        long D = eh.D(j2);
                        b = mue.b(mna.b(D) / 2.0f, mna.a(D) / 2.0f);
                    }
                    long i2 = yrdVar.i(b);
                    float d = yrdVar.d(dce.m(b2, f, f2) / lz9.b(akcVar.a), false);
                    final akc a = akc.a(akcVar2, mz9.a(d, d), yrdVar.c(d, vye.i(lz9.b(j6), akcVar2.b, d, vye.k(j2, j4, yrdVar.g, yrdVar.h, yrdVar.i, 0, b3, j5, i2), z78.b)), 0L, 28);
                    qw6 qw6Var = yrdVar.a;
                    final z78 z78Var2 = (z78) this.b;
                    vt4 vt4Var = new vt4() { // from class: trd
                        @Override // defpackage.vt4
                        public final Object invoke() {
                            String str;
                            StringBuilder sb = new StringBuilder("ZoomableState. rollback. focus=");
                            yrd.this.getClass();
                            z78 z78Var3 = z78Var2;
                            if (z78Var3 != null) {
                                str = mue.t(z78Var3.a);
                            } else {
                                str = null;
                            }
                            sb.append(str);
                            sb.append(". currentScale=");
                            sb.append(yz1.k(4, b2));
                            sb.append(", minScale=");
                            sb.append(yz1.k(4, f));
                            sb.append(", maxScale=");
                            sb.append(yz1.k(4, f2));
                            sb.append(", userOffsetBoundsRect=");
                            sb.append(fpe.x(sk9Var));
                            sb.append(", currentUserOffset=");
                            sb.append(mue.t(j5));
                            sb.append(", currentUserTransform=");
                            sb.append(v9e.P(akcVar2));
                            sb.append(", newUserTransform=");
                            sb.append(v9e.P(a));
                            return sb.toString();
                        }
                    };
                    qw6Var.getClass();
                    qw6Var.b(mw6.b, vt4Var);
                    Integer num = new Integer(32);
                    this.c = 1;
                    Object a2 = yrd.a(yrdVar, a, num, "rollback", this);
                    n82 n82Var = n82.a;
                    if (a2 == n82Var) {
                        return n82Var;
                    }
                } else {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new q4c((pn1) this.d, (y5c) this.b, m42Var, 0);
            case 1:
                q4c q4cVar = new q4c(this.c, m42Var, (y5c) this.b);
                q4cVar.d = obj;
                return q4cVar;
            case 2:
                return new q4c((y5c) this.b, m42Var, 2);
            case 3:
                return new q4c((y5c) this.b, m42Var, 3);
            case 4:
                return new q4c((y5c) this.d, m42Var);
            case 5:
                q4c q4cVar2 = new q4c((n6c) this.b, m42Var, 5);
                q4cVar2.d = obj;
                return q4cVar2;
            case 6:
                return new q4c((w6c) this.d, (String) this.b, m42Var, 6);
            case 7:
                q4c q4cVar3 = new q4c((k8c) this.b, m42Var, 7);
                q4cVar3.d = obj;
                return q4cVar3;
            case 8:
                return new q4c((s8c) this.d, (m82) this.b, m42Var, 8);
            case 9:
                q4c q4cVar4 = new q4c((gbc) this.b, m42Var, 9);
                q4cVar4.d = obj;
                return q4cVar4;
            case 10:
                return new q4c((gbc) this.d, (List) this.b, m42Var, 10);
            case 11:
                return new q4c((shc) this.d, (String) this.b, m42Var, 11);
            case 12:
                return new q4c((shc) this.d, (w43) this.b, m42Var, 12);
            case 13:
                return new q4c((koc) this.d, (vt4) this.b, m42Var, 13);
            case 14:
                return new q4c((tqc) this.d, (nb1) this.b, m42Var, 14);
            case 15:
                q4c q4cVar5 = new q4c((tj4) this.b, m42Var, 15);
                q4cVar5.d = obj;
                return q4cVar5;
            case 16:
                q4c q4cVar6 = new q4c((szc) this.b, m42Var, 16);
                q4cVar6.d = obj;
                return q4cVar6;
            case 17:
                q4c q4cVar7 = new q4c((d1d) this.b, m42Var, 17);
                q4cVar7.d = obj;
                return q4cVar7;
            case 18:
                q4c q4cVar8 = new q4c((o5d) this.b, m42Var, 18);
                q4cVar8.d = obj;
                return q4cVar8;
            case 19:
                return new q4c((gcd) this.d, (xic) this.b, m42Var, 19);
            case 20:
                return new q4c((fbd) this.d, (gcd) this.b, m42Var, 20);
            case 21:
                return new q4c((lq) this.d, (vt4) this.b, m42Var, 21);
            case 22:
                q4c q4cVar9 = new q4c((ubd) this.b, m42Var, 22);
                q4cVar9.d = obj;
                return q4cVar9;
            case 23:
                return new q4c((ubd) this.b, m42Var, 23);
            case 24:
                return new q4c((s02) this.d, this.b, m42Var, 24);
            case 25:
                return new q4c((kk9) this.d, (View) this.b, m42Var, 25);
            case 26:
                q4c q4cVar10 = new q4c((eod) this.b, m42Var, 26);
                q4cVar10.d = obj;
                return q4cVar10;
            case 27:
                return new q4c((yrd) this.d, (String) this.b, m42Var, 27);
            case 28:
                return new q4c((yrd) this.d, (z78) this.b, m42Var, 28);
            default:
                return new q4c((d19) this.d, (t3c) this.b, m42Var, 29);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((q4c) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((q4c) create(obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((q4c) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((q4c) create((bt2) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((q4c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090 A[Catch: all -> 0x007e, TryCatch #8 {all -> 0x007e, blocks: (B:29:0x0078, B:41:0x00a1, B:36:0x008a, B:38:0x0090, B:43:0x00a7, B:35:0x0088), top: B:539:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #8 {all -> 0x007e, blocks: (B:29:0x0078, B:41:0x00a1, B:36:0x008a, B:38:0x0090, B:43:0x00a7, B:35:0x0088), top: B:539:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0838 A[LOOP:3: B:442:0x0838->B:443:0x0849, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x084f A[LOOP:4: B:446:0x084f->B:450:0x0868, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x08a5 A[LOOP:2: B:467:0x08a5->B:485:0x0956, LOOP_START, PHI: r11 
      PHI: (r11v4 boolean) = (r11v0 boolean), (r11v7 boolean) binds: [B:466:0x08a3, B:485:0x0956] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:564:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:607:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:608:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:609:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:612:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:613:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:615:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:616:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [bt2] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r1v47, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [wl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009e -> B:41:0x00a1). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 2728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4c(y5c y5cVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 4;
        this.d = y5cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4c(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4c(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.b = obj2;
    }
}
