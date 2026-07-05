package j$.time.temporal;

import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public interface TemporalField {
    s A(TemporalAccessor temporalAccessor);

    default TemporalAccessor F(Map map, c0 c0Var, d0 d0Var) {
        return null;
    }

    s I();

    long N(TemporalAccessor temporalAccessor);

    l T(l lVar, long j);

    boolean isDateBased();

    boolean v(TemporalAccessor temporalAccessor);
}
