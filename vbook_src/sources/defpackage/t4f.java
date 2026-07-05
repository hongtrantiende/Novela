package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t4f  reason: default package */
/* loaded from: classes.dex */
public final class t4f implements Comparable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(t4f.class, Object.class, "b");
    public static final /* synthetic */ long d = u4f.a.objectFieldOffset(t4f.class.getDeclaredField("b"));
    public final String a;
    public volatile Object b;

    public /* synthetic */ t4f(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        t4f t4fVar;
        int i = 0;
        while (true) {
            Object obj = this.b;
            if (obj instanceof byte[]) {
                byte[] bArr3 = (byte[]) obj;
                if (!Arrays.equals(bArr, bArr3)) {
                    i = 1;
                    bArr2 = new byte[][]{bArr3, bArr};
                } else {
                    return;
                }
            } else {
                byte[][] bArr4 = (byte[][]) obj;
                while (true) {
                    int length = bArr4.length;
                    if (i < length) {
                        if (!Arrays.equals(bArr, bArr4[i])) {
                            i++;
                        } else {
                            return;
                        }
                    } else {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr4, length + 1);
                        bArr2[length] = bArr;
                        break;
                    }
                }
            }
            byte[][] bArr5 = bArr2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = u4f.a;
                long j = d;
                t4fVar = this;
                if (unsafe.compareAndSwapObject(t4fVar, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(t4fVar, j) != obj) {
                    break;
                }
                this = t4fVar;
            }
            this = t4fVar;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((String) obj);
    }
}
