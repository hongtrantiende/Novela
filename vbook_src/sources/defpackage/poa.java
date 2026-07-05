package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: poa  reason: default package */
/* loaded from: classes.dex */
public final class poa implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ poa(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                return ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 2:
                return ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 3:
                return ((eja) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                return ((dva) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 5:
                return ((dva) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 6:
                int intValue = ((Number) obj).intValue();
                return ((tsa) obj3).invoke(Integer.valueOf(intValue), ((List) obj2).get(intValue));
            case 7:
                int intValue2 = ((Number) obj).intValue();
                return ((nd1) obj3).invoke(Integer.valueOf(intValue2), ((List) obj2).get(intValue2));
            case 8:
                return ((clb) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 9:
                int intValue3 = ((Number) obj).intValue();
                return ((tsa) obj3).invoke(Integer.valueOf(intValue3), ((List) obj2).get(intValue3));
            case 10:
                int intValue4 = ((Number) obj).intValue();
                return ((tsa) obj3).invoke(Integer.valueOf(intValue4), ((List) obj2).get(intValue4));
            case 11:
                KeyEvent keyEvent = ((g86) obj).a;
                pm4 pm4Var = (pm4) obj3;
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && gae.j(keyEvent) == 2 && keyEvent.getSource() != 257)) {
                    if (axe.b(19, keyEvent)) {
                        z = ((rm4) pm4Var).g(5, true);
                    } else if (axe.b(20, keyEvent)) {
                        z = ((rm4) pm4Var).g(6, true);
                    } else if (axe.b(21, keyEvent)) {
                        z = ((rm4) pm4Var).g(3, true);
                    } else if (axe.b(22, keyEvent)) {
                        z = ((rm4) pm4Var).g(4, true);
                    } else if (axe.b(23, keyEvent)) {
                        bsa bsaVar = ((ol6) obj2).c;
                        if (bsaVar != null) {
                            ((w03) bsaVar).b();
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                int intValue5 = ((Number) obj).intValue();
                return ((tsa) obj3).invoke(Integer.valueOf(intValue5), ((List) obj2).get(intValue5));
            case 13:
                int intValue6 = ((Number) obj).intValue();
                return ((tsa) obj3).invoke(Integer.valueOf(intValue6), ((List) obj2).get(intValue6));
            case 14:
                return ((txb) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 15:
                Throwable th = (Throwable) obj;
                ((mkc) obj3).a.g.j((cub) obj2);
                return pvcVar;
            case 16:
                int intValue7 = ((Number) obj).intValue();
                return ((tsa) obj3).invoke(Integer.valueOf(intValue7), ((List) obj2).get(intValue7));
            case 17:
                int intValue8 = ((Number) obj).intValue();
                return ((tsa) obj3).invoke(Integer.valueOf(intValue8), ((List) obj2).get(intValue8));
            case 18:
                return ((h4d) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof fnd) {
                    ((lr6) obj3).c.compareAndSet(-256, ((fnd) th2).a);
                }
                ((ListenableFuture) obj2).cancel(false);
                return pvcVar;
        }
    }
}
