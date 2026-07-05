package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v0f  reason: default package */
/* loaded from: classes.dex */
public abstract class v0f {
    public static final mce a;

    /* JADX WARN: Type inference failed for: r5v0, types: [c41, xxd, java.lang.Object] */
    static {
        byd bydVar;
        ((txd) mxd.a).getClass();
        AtomicReference atomicReference = xxd.g;
        String str = "Phlogger";
        if (atomicReference.get() != null) {
            zxd zxdVar = (zxd) atomicReference.get();
            bydVar = new byd("Phlogger", zxdVar.a, zxdVar.b, zxdVar.c);
        } else {
            int i = 7;
            while (true) {
                if (i >= 0) {
                    char charAt = "Phlogger".charAt(i);
                    if (charAt == '$') {
                        str = "Phlogger".replace('$', '.');
                        break;
                    } else if (charAt == '.') {
                        break;
                    } else {
                        i--;
                    }
                } else {
                    break;
                }
            }
            ?? c41Var = new c41(str, 4);
            if (!xxd.d && !xxd.e) {
                if (xxd.f) {
                    zxd zxdVar2 = byd.i;
                    c41Var.c = new byd(str, Level.OFF, zxdVar2.b, zxdVar2.c);
                } else {
                    c41Var.c = null;
                }
            } else {
                c41Var.c = new ayd(str);
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = vxd.a;
            concurrentLinkedQueue.offer(c41Var);
            bydVar = c41Var;
            if (atomicReference.get() != null) {
                while (true) {
                    xxd xxdVar = (xxd) concurrentLinkedQueue.poll();
                    if (xxdVar == null) {
                        break;
                    }
                    zxd zxdVar3 = (zxd) atomicReference.get();
                    xxdVar.c = new byd(xxdVar.b, zxdVar3.a, zxdVar3.b, zxdVar3.c);
                }
                xxd.j();
                bydVar = c41Var;
            }
        }
        a = new mce(bydVar);
    }
}
