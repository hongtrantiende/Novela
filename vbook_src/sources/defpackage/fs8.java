package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fs8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs8 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss8 b;

    public /* synthetic */ fs8(ss8 ss8Var, int i) {
        this.a = i;
        this.b = ss8Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i;
        Object value;
        Object value2;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        ss8 ss8Var = this.b;
        switch (i2) {
            case 0:
                return ((gyb) ss8Var.H).a(22, ss8Var.c);
            case 1:
                cza czaVar = ss8Var.X;
                ArrayList m = ss8Var.m();
                if (!m.isEmpty()) {
                    int i3 = ((vxb) czaVar.getValue()).d + 1;
                    int size = m.size() - 1;
                    if (i3 > size) {
                        i = size;
                    } else {
                        i = i3;
                    }
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                        } while (!czaVar.l(value, vxb.a((vxb) value, false, 0, null, i, 0, null, 55)));
                        ss8Var.o((rxb) m.get(i));
                    } else {
                        ss8Var.o((rxb) m.get(i));
                    }
                }
                return pvcVar;
            default:
                cza czaVar2 = ss8Var.X;
                ArrayList m2 = ss8Var.m();
                if (!m2.isEmpty()) {
                    int i4 = ((vxb) czaVar2.getValue()).d - 1;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    int i5 = i4;
                    if (czaVar2 != null) {
                        do {
                            value2 = czaVar2.getValue();
                        } while (!czaVar2.l(value2, vxb.a((vxb) value2, false, 0, null, i5, 0, null, 55)));
                        ss8Var.o((rxb) m2.get(i5));
                    } else {
                        ss8Var.o((rxb) m2.get(i5));
                    }
                }
                return pvcVar;
        }
    }
}
