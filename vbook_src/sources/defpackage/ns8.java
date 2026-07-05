package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns8  reason: default package */
/* loaded from: classes3.dex */
public final class ns8 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss8 b;

    public /* synthetic */ ns8(ss8 ss8Var, int i) {
        this.a = i;
        this.b = ss8Var;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        int i;
        Object value2;
        int i2 = this.a;
        ss8 ss8Var = this.b;
        pvc pvcVar = pvc.a;
        switch (i2) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    mq5 mq5Var = null;
                    if (it.hasNext()) {
                        xac xacVar = (xac) it.next();
                        Integer R = r4b.R(10, xacVar.d);
                        if (R != null) {
                            int intValue = R.intValue();
                            String str = xacVar.a;
                            String str2 = (String) sl1.d0(xacVar.c.values());
                            if (str2 == null) {
                                str2 = "";
                            }
                            mq5Var = new mq5(str, str2, intValue, nae.e, xacVar.b, 0, true, false, false, 0L);
                        }
                        if (mq5Var != null) {
                            arrayList.add(mq5Var);
                        }
                    } else {
                        cza czaVar = ss8Var.U;
                        if (czaVar != null) {
                            do {
                                value = czaVar.getValue();
                            } while (!czaVar.l(value, kq5.a((kq5) value, null, arrayList, null, 5)));
                            return pvcVar;
                        }
                        return pvcVar;
                    }
                }
            default:
                lpc lpcVar = (lpc) obj;
                String str3 = lpcVar.a;
                String str4 = ss8Var.c;
                cza czaVar2 = ss8Var.T;
                if (c16.i(str3, str4) && (i = lpcVar.b) >= 0 && i != ((xp5) czaVar2.getValue()).b && czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, xp5.a((xp5) value2, i, i, 4)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
