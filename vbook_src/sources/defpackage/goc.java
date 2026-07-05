package defpackage;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: goc  reason: default package */
/* loaded from: classes.dex */
public final class goc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ koc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ goc(koc kocVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = kocVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        koc kocVar = this.d;
        switch (i) {
            case 0:
                goc gocVar = new goc(kocVar, m42Var, 0);
                gocVar.c = obj;
                return gocVar;
            case 1:
                goc gocVar2 = new goc(kocVar, m42Var, 1);
                gocVar2.c = obj;
                return gocVar2;
            default:
                goc gocVar3 = new goc(kocVar, m42Var, 2);
                gocVar3.c = obj;
                return gocVar3;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((goc) create((r19) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((goc) create((xjc) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((goc) create((xjc) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        xjc xjcVar;
        Object d;
        Object a;
        xjc xjcVar2;
        Object d2;
        o78[] o78VarArr;
        o78 o78Var;
        int i = this.a;
        wjc wjcVar = wjc.b;
        boolean z = false;
        n82 n82Var = n82.a;
        boolean z2 = true;
        koc kocVar = this.d;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object a2 = koc.a(kocVar, (r19) this.c, this);
                if (a2 == n82Var) {
                    return n82Var;
                }
                return a2;
            case 1:
                int i3 = this.b;
                try {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                hre.r(obj);
                                a = obj;
                                return (Set) a;
                            }
                            vs.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xjcVar = (xjc) this.c;
                        hre.r(obj);
                        d = obj;
                    } else {
                        hre.r(obj);
                        xjcVar = (xjc) this.c;
                        this.c = xjcVar;
                        this.b = 1;
                        d = xjcVar.d(this);
                        if (d == n82Var) {
                            return n82Var;
                        }
                    }
                    if (!((Boolean) d).booleanValue()) {
                        goc gocVar = new goc(kocVar, null, 0);
                        this.c = null;
                        this.b = 2;
                        a = xjcVar.a(wjcVar, gocVar, this);
                        if (a == n82Var) {
                            return n82Var;
                        }
                        return (Set) a;
                    }
                } catch (SQLException unused) {
                }
                return rs3.a;
            default:
                int i4 = this.b;
                pvc pvcVar = pvc.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            hre.r(obj);
                            return pvcVar;
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xjcVar2 = (xjc) this.c;
                    hre.r(obj);
                    d2 = obj;
                } else {
                    hre.r(obj);
                    xjcVar2 = (xjc) this.c;
                    this.c = xjcVar2;
                    this.b = 1;
                    d2 = xjcVar2.d(this);
                    if (d2 == n82Var) {
                        return n82Var;
                    }
                }
                if (!((Boolean) d2).booleanValue()) {
                    o40 o40Var = (o40) kocVar.h;
                    long[] jArr = (long[]) o40Var.c;
                    ReentrantLock reentrantLock = (ReentrantLock) o40Var.b;
                    reentrantLock.lock();
                    try {
                        if (!o40Var.a) {
                            reentrantLock.unlock();
                            o78VarArr = null;
                        } else {
                            o40Var.a = false;
                            int length = jArr.length;
                            o78VarArr = new o78[length];
                            int i5 = 0;
                            boolean z3 = false;
                            while (i5 < length) {
                                if (jArr[i5] > 0) {
                                    z = z2;
                                }
                                boolean[] zArr = (boolean[]) o40Var.d;
                                if (z != zArr[i5]) {
                                    zArr[i5] = z;
                                    if (z) {
                                        o78Var = o78.b;
                                    } else {
                                        o78Var = o78.c;
                                    }
                                    z3 = true;
                                } else {
                                    o78Var = o78.a;
                                }
                                o78VarArr[i5] = o78Var;
                                i5++;
                                z = false;
                                z2 = true;
                            }
                            if (!z3) {
                                o78VarArr = null;
                            }
                            reentrantLock.unlock();
                        }
                        if (o78VarArr != null) {
                            zo1 zo1Var = new zo1(o78VarArr, kocVar, xjcVar2, null);
                            this.c = null;
                            this.b = 2;
                            if (xjcVar2.a(wjcVar, zo1Var, this) == n82Var) {
                                return n82Var;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return pvcVar;
        }
    }
}
