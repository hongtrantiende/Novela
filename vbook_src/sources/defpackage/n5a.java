package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n5a  reason: default package */
/* loaded from: classes3.dex */
public abstract class n5a {
    public static final e5a a = new e5a(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(e5a e5aVar) {
        int i;
        e5aVar.getClass();
        if (e5aVar.f == null && e5aVar.g == null) {
            if (!e5aVar.d) {
                AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
                e5a e5aVar2 = a;
                e5a e5aVar3 = (e5a) atomicReference.getAndSet(e5aVar2);
                if (e5aVar3 == e5aVar2) {
                    return;
                }
                if (e5aVar3 != null) {
                    i = e5aVar3.c;
                } else {
                    i = 0;
                }
                if (i >= 65536) {
                    atomicReference.set(e5aVar3);
                    return;
                }
                e5aVar.f = e5aVar3;
                e5aVar.b = 0;
                e5aVar.c = i + 8192;
                atomicReference.set(e5aVar);
                return;
            }
            return;
        }
        vs.m("Failed requirement.");
    }

    public static final e5a b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        e5a e5aVar = a;
        e5a e5aVar2 = (e5a) atomicReference.getAndSet(e5aVar);
        if (e5aVar2 == e5aVar) {
            return new e5a();
        }
        if (e5aVar2 == null) {
            atomicReference.set(null);
            return new e5a();
        }
        atomicReference.set(e5aVar2.f);
        e5aVar2.f = null;
        e5aVar2.c = 0;
        return e5aVar2;
    }
}
