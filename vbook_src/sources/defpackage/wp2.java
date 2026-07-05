package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wp2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class wp2 extends xu4 implements ru4 {
    public static final wp2 a = new xu4(8, tp2.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;IJJ)V", 0);

    @Override // defpackage.ru4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Number number) {
        String str = (String) obj2;
        Map map = (Map) obj3;
        int intValue = ((Number) obj6).intValue();
        long longValue = ((Number) obj7).longValue();
        long longValue2 = number.longValue();
        str.getClass();
        map.getClass();
        return new tp2((String) obj, str, map, (String) obj4, (String) obj5, intValue, longValue, longValue2);
    }
}
