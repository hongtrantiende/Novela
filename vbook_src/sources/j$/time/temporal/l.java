package j$.time.temporal;

import j$.time.LocalDate;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public interface l extends TemporalAccessor {
    l a(long j, TemporalField temporalField);

    l b(long j, q qVar);

    default l c(long j, q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, qVar);
    }

    l e(LocalDate localDate);
}
