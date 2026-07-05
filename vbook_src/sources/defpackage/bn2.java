package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bn2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn2 extends xu4 implements pu4 {
    public static final bn2 a = new xu4(6, xm2.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;JJ)V", 0);

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int intValue = ((Number) obj3).intValue();
        Map map = (Map) obj4;
        long longValue = ((Number) obj5).longValue();
        long longValue2 = ((Number) obj6).longValue();
        str.getClass();
        str2.getClass();
        map.getClass();
        return new xm2(str, str2, intValue, map, longValue, longValue2);
    }
}
