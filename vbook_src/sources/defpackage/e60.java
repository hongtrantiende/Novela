package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e60  reason: default package */
/* loaded from: classes.dex */
public class e60 extends Exception {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(String str, int i) {
        super("Bad Content-Type format: ".concat(str));
        String str2;
        this.a = i;
        switch (i) {
            case 4:
                this.a = 4;
                if (str != null) {
                    str2 = str.toString();
                } else {
                    str2 = null;
                }
                super(str2);
                return;
            case 11:
                am8.q(str, "Detail message must not be empty");
                super(str);
                return;
            default:
                str.getClass();
                return;
        }
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 28:
                synchronized (this) {
                    setStackTrace(new StackTraceElement[0]);
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e60(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e60(int i, String str, boolean z) {
        super(str);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e60(int i, Throwable th) {
        super(th);
        this.a = i;
    }
}
