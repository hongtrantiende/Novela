package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o5a  reason: default package */
/* loaded from: classes3.dex */
public abstract class o5a {
    public static final d5a a = new d5a(new byte[0], 0, 0, null);
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final AtomicReferenceArray f;
    public static final AtomicReferenceArray g;

    static {
        String str;
        int intValue;
        int i = 0;
        int i2 = 1;
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        int i3 = highestOneBit / 2;
        if (i3 >= 1) {
            i2 = i3;
        }
        c = i2;
        if (c16.i(System.getProperty("java.vm.name"), "Dalvik")) {
            str = "0";
        } else {
            str = "4194304";
        }
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        property.getClass();
        Integer R = r4b.R(10, property);
        if (R != null && (intValue = R.intValue()) >= 0) {
            i = intValue;
        }
        d = i;
        int i4 = i / i2;
        if (i4 < 8192) {
            i4 = 8192;
        }
        e = i4;
        f = new AtomicReferenceArray(highestOneBit);
        g = new AtomicReferenceArray(i2);
    }

    public static final void a(d5a d5aVar) {
        int i;
        int i2;
        d5a d5aVar2 = a;
        d5aVar.getClass();
        if (d5aVar.f == null && d5aVar.g == null) {
            am9 am9Var = d5aVar.d;
            if (am9Var != null && am9Var.a != 0) {
                int decrementAndGet = am9.b.decrementAndGet(am9Var);
                if (decrementAndGet < 0) {
                    if (decrementAndGet == -1) {
                        am9Var.a = 0;
                    } else {
                        p1a.h(decrementAndGet + 1, "Shared copies count is negative: ");
                        return;
                    }
                } else {
                    return;
                }
            }
            AtomicReferenceArray atomicReferenceArray = f;
            int id = (int) ((b - 1) & Thread.currentThread().getId());
            d5aVar.b = 0;
            d5aVar.e = true;
            while (true) {
                d5a d5aVar3 = (d5a) atomicReferenceArray.get(id);
                if (d5aVar3 != d5aVar2) {
                    if (d5aVar3 != null) {
                        i = d5aVar3.c;
                    } else {
                        i = 0;
                    }
                    if (i >= 65536) {
                        if (d > 0) {
                            d5aVar.b = 0;
                            d5aVar.e = true;
                            int id2 = (int) ((c - 1) & Thread.currentThread().getId());
                            AtomicReferenceArray atomicReferenceArray2 = g;
                            int i3 = 0;
                            while (true) {
                                d5a d5aVar4 = (d5a) atomicReferenceArray2.get(id2);
                                if (d5aVar4 != d5aVar2) {
                                    if (d5aVar4 != null) {
                                        i2 = d5aVar4.c;
                                    } else {
                                        i2 = 0;
                                    }
                                    int i4 = i2 + 8192;
                                    if (i4 > e) {
                                        int i5 = c;
                                        if (i3 < i5) {
                                            i3++;
                                            id2 = (id2 + 1) & (i5 - 1);
                                        } else {
                                            return;
                                        }
                                    } else {
                                        d5aVar.f = d5aVar4;
                                        d5aVar.c = i4;
                                        while (!atomicReferenceArray2.compareAndSet(id2, d5aVar4, d5aVar)) {
                                            if (atomicReferenceArray2.get(id2) != d5aVar4) {
                                                break;
                                            }
                                        }
                                        return;
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        d5aVar.f = d5aVar3;
                        d5aVar.c = i + 8192;
                        while (!atomicReferenceArray.compareAndSet(id, d5aVar3, d5aVar)) {
                            if (atomicReferenceArray.get(id) != d5aVar3) {
                                break;
                            }
                        }
                        return;
                    }
                }
            }
        } else {
            vs.m("Failed requirement.");
        }
    }

    public static final d5a b() {
        AtomicReferenceArray atomicReferenceArray;
        d5a d5aVar;
        d5a d5aVar2;
        int id = (int) ((b - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f;
            d5aVar = a;
            d5aVar2 = (d5a) atomicReferenceArray.getAndSet(id, d5aVar);
        } while (c16.i(d5aVar2, d5aVar));
        if (d5aVar2 == null) {
            atomicReferenceArray.set(id, null);
            if (d > 0) {
                int i = c;
                int id2 = (int) (Thread.currentThread().getId() & (i - 1));
                int i2 = 0;
                while (true) {
                    AtomicReferenceArray atomicReferenceArray2 = g;
                    d5a d5aVar3 = (d5a) atomicReferenceArray2.getAndSet(id2, d5aVar);
                    if (!c16.i(d5aVar3, d5aVar)) {
                        if (d5aVar3 == null) {
                            atomicReferenceArray2.set(id2, null);
                            if (i2 < i) {
                                id2 = (id2 + 1) & (i - 1);
                                i2++;
                            } else {
                                return new d5a();
                            }
                        } else {
                            atomicReferenceArray2.set(id2, d5aVar3.f);
                            d5aVar3.f = null;
                            d5aVar3.c = 0;
                            return d5aVar3;
                        }
                    }
                }
            } else {
                return new d5a();
            }
        } else {
            atomicReferenceArray.set(id, d5aVar2.f);
            d5aVar2.f = null;
            d5aVar2.c = 0;
            return d5aVar2;
        }
    }
}
