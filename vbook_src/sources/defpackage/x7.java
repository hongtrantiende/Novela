package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x7  reason: default package */
/* loaded from: classes3.dex */
public final class x7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x7(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return ((y4) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                return ((y4) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 2:
                return ((y4) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 3:
                return ((nj0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                return ((nj0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 5:
                return ((nj0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 6:
                return ((v71) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 7:
                return ((v71) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 8:
                return ((v71) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 9:
                return ((v71) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 10:
                int intValue = ((Number) obj).intValue();
                return ((c8) obj3).invoke(Integer.valueOf(intValue), ((List) obj2).get(intValue));
            case 11:
                int intValue2 = ((Number) obj).intValue();
                return ((c8) obj3).invoke(Integer.valueOf(intValue2), ((List) obj2).get(intValue2));
            case 12:
                int intValue3 = ((Number) obj).intValue();
                return ((tv1) obj3).invoke(Integer.valueOf(intValue3), ((List) obj2).get(intValue3));
            case 13:
                return ((ln1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 14:
                ((ln1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "page";
            case 15:
                return ((ln1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 16:
                return ((ln1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 17:
                KeyEvent keyEvent = ((g86) obj).a;
                if (((ol6) obj3).a() == l35.b && keyEvent.getKeyCode() == 4) {
                    int j = gae.j(keyEvent);
                    z = true;
                    if (j == 1) {
                        ((gtb) obj2).g(null);
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 18:
                int intValue4 = ((Number) obj).intValue();
                return ((tv1) obj3).invoke(Integer.valueOf(intValue4), ((List) obj2).get(intValue4));
            case 19:
                return ((u83) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 20:
                return ((u83) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 21:
                return ((u83) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 22:
                return ((u83) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                return ((u83) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                return ((u83) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 25:
                int intValue5 = ((Number) obj).intValue();
                return ((pg2) obj3).invoke(Integer.valueOf(intValue5), ((List) obj2).get(intValue5));
            case 26:
                return ((dw3) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 27:
                int intValue6 = ((Number) obj).intValue();
                return ((sj) obj3).invoke(Integer.valueOf(intValue6), ((ArrayList) obj2).get(intValue6));
            case 28:
                int intValue7 = ((Number) obj).intValue();
                return ((pg2) obj3).invoke(Integer.valueOf(intValue7), ((List) obj2).get(intValue7));
            default:
                int intValue8 = ((Number) obj).intValue();
                return ((pg2) obj3).invoke(Integer.valueOf(intValue8), ((List) obj2).get(intValue8));
        }
    }
}
