package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yz8  reason: default package */
/* loaded from: classes.dex */
public final class yz8 implements Handler.Callback {
    public boolean C;
    public boolean D;
    public boolean E;
    public final ij1 a;
    public final n07 b;
    public ff2 f;
    public final TreeMap e = new TreeMap();
    public final Handler d = a2d.p(this);
    public final yw c = new yw(1);

    public yz8(ff2 ff2Var, n07 n07Var, ij1 ij1Var) {
        this.f = ff2Var;
        this.b = n07Var;
        this.a = ij1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.E) {
            if (message.what != 1) {
                return false;
            }
            wz8 wz8Var = (wz8) message.obj;
            long j = wz8Var.a;
            long j2 = wz8Var.b;
            Long valueOf = Long.valueOf(j2);
            TreeMap treeMap = this.e;
            Long l = (Long) treeMap.get(valueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            } else if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
