package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cza  reason: default package */
/* loaded from: classes3.dex */
public final class cza extends q3 implements bw7, sj4, zu4 {
    private volatile /* synthetic */ Object _state$volatile;
    public int e;
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(cza.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long C = u4f.a.objectFieldOffset(cza.class.getDeclaredField("_state$volatile"));

    public cza(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r14.equals(r15) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
        if (r15 == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006c, B:30:0x0074, B:33:0x007b, B:34:0x007f, B:36:0x0082, B:46:0x00a3, B:49:0x00b3, B:50:0x00cf, B:56:0x00df, B:53:0x00d6, B:55:0x00dc, B:38:0x0088, B:42:0x008f, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006c, B:30:0x0074, B:33:0x007b, B:34:0x007f, B:36:0x0082, B:46:0x00a3, B:49:0x00b3, B:50:0x00cf, B:56:0x00df, B:53:0x00d6, B:55:0x00dc, B:38:0x0088, B:42:0x008f, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b2 -> B:28:0x006c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00e6 -> B:28:0x006c). Please submit an issue!!! */
    @Override // defpackage.sj4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.tj4 r14, defpackage.m42 r15) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cza.a(tj4, m42):java.lang.Object");
    }

    @Override // defpackage.xv7, defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        m(obj);
        return pvc.a;
    }

    @Override // defpackage.zu4
    public final sj4 c(d82 d82Var, int i, py0 py0Var) {
        if ((((i >= 0 && i < 2) || i == -2) && py0Var == py0.b) || ((i == 0 || i == -3) && py0Var == py0.a)) {
            return this;
        }
        return new za1(this, d82Var, i, py0Var);
    }

    @Override // defpackage.xv7
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.xv7
    public final boolean f(Object obj) {
        m(obj);
        return true;
    }

    @Override // defpackage.aza
    public final Object getValue() {
        f.getClass();
        Object objectVolatile = u4f.a.getObjectVolatile(this, C);
        if (objectVolatile == p68.a) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.q3
    public final r3 h() {
        return new eza();
    }

    @Override // defpackage.q3
    public final r3[] i() {
        return new eza[2];
    }

    public final boolean l(Object obj, Object obj2) {
        lie lieVar = p68.a;
        if (obj == null) {
            obj = lieVar;
        }
        if (obj2 == null) {
            obj2 = lieVar;
        }
        return n(obj, obj2);
    }

    public final void m(Object obj) {
        if (obj == null) {
            obj = p68.a;
        }
        n(null, obj);
    }

    public final boolean n(Object obj, Object obj2) {
        int i;
        r3[] r3VarArr;
        lie lieVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !c16.i(obj3, obj)) {
                return false;
            }
            if (c16.i(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.e = i3;
                r3[] r3VarArr2 = this.a;
                while (true) {
                    eza[] ezaVarArr = (eza[]) r3VarArr2;
                    if (ezaVarArr != null) {
                        for (eza ezaVar : ezaVarArr) {
                            if (ezaVar != null) {
                                AtomicReference atomicReference = ezaVar.a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (lieVar = dza.b)) {
                                        lie lieVar2 = dza.a;
                                        if (obj4 == lieVar2) {
                                            while (!atomicReference.compareAndSet(obj4, lieVar)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, lieVar2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((f61) obj4).resumeWith(pvc.a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.e;
                        if (i == i3) {
                            this.e = i3 + 1;
                            return true;
                        }
                        r3VarArr = this.a;
                    }
                    r3VarArr2 = r3VarArr;
                    i3 = i;
                }
            } else {
                this.e = i2 + 2;
                return true;
            }
        }
    }
}
