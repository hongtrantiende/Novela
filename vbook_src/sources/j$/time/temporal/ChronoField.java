package j$.time.temporal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public enum ChronoField implements TemporalField {
    NANO_OF_SECOND("NanoOfSecond", s.f(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", s.f(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", s.f(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", s.f(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", s.f(0, 999)),
    MILLI_OF_DAY("MilliOfDay", s.f(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", s.f(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", s.f(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", s.f(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", s.f(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", s.f(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", s.f(1, 12)),
    HOUR_OF_DAY("HourOfDay", s.f(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", s.f(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", s.f(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", s.f(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", s.f(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", s.f(1, 7)),
    DAY_OF_MONTH("DayOfMonth", s.g(1, 28, 31), 0),
    DAY_OF_YEAR("DayOfYear", s.g(1, 365, 366)),
    EPOCH_DAY("EpochDay", s.f(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", s.g(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", s.f(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", s.f(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", s.f(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", s.g(1, 999999999, 1000000000)),
    YEAR("Year", s.f(-999999999, 999999999), 0),
    ERA("Era", s.f(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", s.f(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", s.f(-64800, 64800));
    
    public final String a;
    public final s b;

    static {
        a aVar = a.NANOS;
    }

    ChronoField(String str, s sVar) {
        this.a = str;
        this.b = sVar;
    }

    @Override // j$.time.temporal.TemporalField
    public final s A(TemporalAccessor temporalAccessor) {
        return temporalAccessor.l(this);
    }

    @Override // j$.time.temporal.TemporalField
    public final s I() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalField
    public final long N(TemporalAccessor temporalAccessor) {
        return temporalAccessor.k(this);
    }

    @Override // j$.time.temporal.TemporalField
    public final l T(l lVar, long j) {
        return lVar.a(j, this);
    }

    public final void W(long j) {
        this.b.b(j, this);
    }

    public final boolean X() {
        if (ordinal() < DAY_OF_WEEK.ordinal()) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        if (ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean v(TemporalAccessor temporalAccessor) {
        return temporalAccessor.i(this);
    }

    ChronoField(String str, s sVar, int i) {
        this.a = str;
        this.b = sVar;
    }
}
