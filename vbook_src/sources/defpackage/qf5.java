package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qf5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf5 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;

    public /* synthetic */ qf5(HashMap hashMap, int i) {
        this.a = i;
        this.b = hashMap;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = "";
        HashMap hashMap = this.b;
        String str2 = (String) obj;
        List list = (List) obj2;
        switch (i) {
            case 0:
                str2.getClass();
                list.getClass();
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str3 = (String) sl1.e0(list);
                if (str3 != null) {
                    str = str3;
                }
                hashMap.put(lowerCase, str);
                return pvcVar;
            default:
                str2.getClass();
                list.getClass();
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                String str4 = (String) sl1.e0(list);
                if (str4 != null) {
                    str = str4;
                }
                hashMap.put(lowerCase2, str);
                return pvcVar;
        }
    }
}
