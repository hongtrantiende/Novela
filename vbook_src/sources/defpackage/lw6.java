package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lw6  reason: default package */
/* loaded from: classes3.dex */
public enum lw6 {
    NONE(0),
    /* JADX INFO: Fake field, exist only in values array */
    FATAL(1),
    ERROR(2),
    WARN(3),
    INFO(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEBUG(5),
    /* JADX INFO: Fake field, exist only in values array */
    TRACE(6);
    
    public static final ox9 b = new ox9(28);
    public static final LinkedHashMap c;
    public final int a;

    static {
        lw6[] values = values();
        int k = p17.k(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(k < 16 ? 16 : k);
        for (lw6 lw6Var : values) {
            linkedHashMap.put(lw6Var.name(), lw6Var);
        }
        c = linkedHashMap;
    }

    lw6(int i) {
        this.a = i;
    }
}
