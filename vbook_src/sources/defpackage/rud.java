package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rud  reason: default package */
/* loaded from: classes.dex */
public final class rud implements OnCompleteListener {
    public final yz4 a;
    public final int b;
    public final jv c;
    public final long d;
    public final long e;

    public rud(yz4 yz4Var, int i, jv jvVar, long j, long j2) {
        this.a = yz4Var;
        this.b = i;
        this.c = jvVar;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.sz1 a(defpackage.oud r4, defpackage.rh0 r5, int r6) {
        /*
            fve r5 = r5.w
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            sz1 r5 = r5.d
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.b
            if (r1 == 0) goto L35
            int[] r1 = r5.d
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.q
            int r6 = r5.e
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rud.a(oud, rh0, int):sz1");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        yz4 yz4Var = this.a;
        if (yz4Var.f()) {
            nu9 nu9Var = (nu9) mu9.s().a;
            if (nu9Var == null || nu9Var.b) {
                oud oudVar = (oud) yz4Var.F.get(this.c);
                if (oudVar != null) {
                    qz4 qz4Var = oudVar.b;
                    if (qz4Var instanceof rh0) {
                        qz4 qz4Var2 = qz4Var;
                        long j3 = this.d;
                        int i6 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        boolean z2 = true;
                        int i7 = 0;
                        if (i6 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i8 = qz4Var2.q;
                        if (nu9Var != null) {
                            z &= nu9Var.c;
                            i = nu9Var.d;
                            i3 = nu9Var.e;
                            i2 = nu9Var.a;
                            if (qz4Var2.w != null && !qz4Var2.q()) {
                                sz1 a = a(oudVar, qz4Var2, this.b);
                                if (a != null) {
                                    if (!a.c || i6 <= 0) {
                                        z2 = false;
                                    }
                                    i3 = a.e;
                                    z = z2;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i9 = i;
                        int i10 = -1;
                        if (task.isSuccessful()) {
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i7 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof fv) {
                                Status status = ((fv) exception).getStatus();
                                i4 = status.a;
                                jz1 jz1Var = status.d;
                                if (jz1Var != null) {
                                    i5 = i4;
                                    i7 = jz1Var.b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i7 = -1;
                        }
                        if (z) {
                            long j4 = this.e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i10 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        sud sudVar = new sud(new cc7(this.b, i5, i7, j, j2, null, null, i8, i10), i2, i9, i3);
                        ovd ovdVar = yz4Var.J;
                        ovdVar.sendMessage(ovdVar.obtainMessage(18, sudVar));
                    }
                }
            }
        }
    }
}
