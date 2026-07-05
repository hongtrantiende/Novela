package org.mozilla.javascript;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.ArrayComprehension;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.Assignment;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.BigIntLiteral;
import org.mozilla.javascript.ast.Block;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.ComputedPropertyKey;
import org.mozilla.javascript.ast.ConditionalExpression;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.DestructuringForm;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.EmptyStatement;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.GeneratorExpression;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;
import org.mozilla.javascript.ast.GeneratorMethodDefinition;
import org.mozilla.javascript.ast.IdeErrorReporter;
import org.mozilla.javascript.ast.IfStatement;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.KeywordLiteral;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.LabeledStatement;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.Loop;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.ObjectProperty;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.StringLiteral;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.SwitchStatement;
import org.mozilla.javascript.ast.TaggedTemplateLiteral;
import org.mozilla.javascript.ast.TemplateCharacters;
import org.mozilla.javascript.ast.TemplateLiteral;
import org.mozilla.javascript.ast.ThrowStatement;
import org.mozilla.javascript.ast.UnaryExpression;
import org.mozilla.javascript.ast.UpdateExpression;
import org.mozilla.javascript.ast.VariableDeclaration;
import org.mozilla.javascript.ast.VariableInitializer;
import org.mozilla.javascript.ast.WhileLoop;
import org.mozilla.javascript.ast.WithStatement;
import org.mozilla.javascript.ast.XmlDotQuery;
import org.mozilla.javascript.ast.XmlElemRef;
import org.mozilla.javascript.ast.XmlExpression;
import org.mozilla.javascript.ast.XmlLiteral;
import org.mozilla.javascript.ast.XmlMemberGet;
import org.mozilla.javascript.ast.XmlPropRef;
import org.mozilla.javascript.ast.XmlRef;
import org.mozilla.javascript.ast.XmlString;
import org.mozilla.javascript.ast.Yield;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class Parser {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ARGC_LIMIT = 65536;
    static final int CLEAR_TI_MASK = 65535;
    private static final int GET_ENTRY = 2;
    private static final int METHOD_ENTRY = 8;
    private static final int PROP_ENTRY = 1;
    private static final int SET_ENTRY = 4;
    static final int TI_AFTER_EOL = 65536;
    static final int TI_CHECK_LABEL = 131072;
    boolean calledByCompileFunction;
    CompilerEnvirons compilerEnv;
    private int currentFlaggedToken;
    private Comment currentJsDocComment;
    private LabeledStatement currentLabel;
    CurrentPositionReporter currentPos;
    Scope currentScope;
    ScriptNode currentScriptOrFn;
    private int currentToken;
    private boolean defaultUseStrictDirective;
    private int endFlags;
    private IdeErrorReporter errorCollector;
    private ErrorReporter errorReporter;
    private boolean inDestructuringAssignment;
    private boolean inForInit;
    protected boolean inUseStrictDirective;
    private boolean insideMethod;
    private Map<String, LabeledStatement> labelSet;
    private int lastTokenColumn;
    private int lastTokenLineno;
    private List<Jump> loopAndSwitchSet;
    private List<Loop> loopSet;
    protected int nestingOfFunction;
    protected int nestingOfFunctionParams;
    private boolean parseFinished;
    private int prevNameTokenColumn;
    private int prevNameTokenLineno;
    private int prevNameTokenStart;
    private String prevNameTokenString;
    private List<Comment> scannedComments;
    private char[] sourceChars;
    private String sourceURI;
    private int syntaxErrorCount;
    private TokenStream ts;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface CurrentPositionReporter {
        int getLength();

        String getLine();

        int getLineno();

        int getOffset();

        int getPosition();
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class ParserException extends RuntimeException {
        private static final long serialVersionUID = 5882582646773765630L;
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public class PerFunctionVariables {
        private Scope savedCurrentScope;
        private ScriptNode savedCurrentScriptOrFn;
        private int savedEndFlags;
        private boolean savedInForInit;
        private Map<String, LabeledStatement> savedLabelSet;
        private List<Jump> savedLoopAndSwitchSet;
        private List<Loop> savedLoopSet;

        public PerFunctionVariables(FunctionNode functionNode) {
            this.savedCurrentScriptOrFn = Parser.this.currentScriptOrFn;
            Parser.this.currentScriptOrFn = functionNode;
            this.savedCurrentScope = Parser.this.currentScope;
            Parser.this.currentScope = functionNode;
            this.savedLabelSet = Parser.this.labelSet;
            Parser.this.labelSet = null;
            this.savedLoopSet = Parser.this.loopSet;
            Parser.this.loopSet = null;
            this.savedLoopAndSwitchSet = Parser.this.loopAndSwitchSet;
            Parser.this.loopAndSwitchSet = null;
            this.savedEndFlags = Parser.this.endFlags;
            Parser.this.endFlags = 0;
            this.savedInForInit = Parser.this.inForInit;
            Parser.this.inForInit = false;
        }

        public void restore() {
            Parser parser = Parser.this;
            parser.currentScriptOrFn = this.savedCurrentScriptOrFn;
            parser.currentScope = this.savedCurrentScope;
            parser.labelSet = this.savedLabelSet;
            Parser.this.loopSet = this.savedLoopSet;
            Parser.this.loopAndSwitchSet = this.savedLoopAndSwitchSet;
            Parser.this.endFlags = this.savedEndFlags;
            Parser.this.inForInit = this.savedInForInit;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface Transformer {
        Node transform(AstNode astNode);
    }

    public Parser(CompilerEnvirons compilerEnvirons, ErrorReporter errorReporter) {
        this.currentFlaggedToken = 0;
        this.prevNameTokenString = "";
        this.lastTokenLineno = -1;
        this.lastTokenColumn = -1;
        this.compilerEnv = compilerEnvirons;
        this.errorReporter = errorReporter;
        if (errorReporter instanceof IdeErrorReporter) {
            this.errorCollector = (IdeErrorReporter) errorReporter;
        }
    }

    private AstNode addExpr() {
        AstNode mulExpr = mulExpr();
        while (true) {
            int peekToken = peekToken();
            int i = this.ts.tokenBeg;
            if (peekToken != 21 && peekToken != 22) {
                return mulExpr;
            }
            consumeToken();
            mulExpr = new InfixExpression(peekToken, mulExpr, mulExpr(), i);
        }
    }

    private AstNode andExpr() {
        AstNode bitOrExpr = bitOrExpr();
        if (matchToken(Token.AND, true)) {
            return new InfixExpression((int) Token.AND, bitOrExpr, andExpr(), this.ts.tokenBeg);
        }
        return bitOrExpr;
    }

    /* JADX WARN: Finally extract failed */
    private List<AstNode> argumentList() {
        if (matchToken(97, true)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = this.inForInit;
        this.inForInit = false;
        do {
            try {
                if (peekToken() == 97) {
                    break;
                }
                if (peekToken() == 78) {
                    reportError("msg.yield.parenthesized");
                }
                AstNode assignExpr = assignExpr();
                if (peekToken() == 132) {
                    try {
                        arrayList.add(generatorExpression(assignExpr, 0, true));
                    } catch (IOException unused) {
                    }
                } else {
                    arrayList.add(assignExpr);
                }
            } catch (Throwable th) {
                this.inForInit = z;
                throw th;
            }
        } while (matchToken(98, true));
        this.inForInit = z;
        mustMatchToken(97, "msg.no.paren.arg", true);
        return arrayList;
    }

    private AstNode arrayComprehension(AstNode astNode, int i) {
        int i2;
        ConditionData conditionData;
        ArrayList arrayList = new ArrayList();
        while (peekToken() == 132) {
            arrayList.add(arrayComprehensionLoop());
        }
        if (peekToken() == 125) {
            consumeToken();
            i2 = this.ts.tokenBeg - i;
            conditionData = condition();
        } else {
            i2 = -1;
            conditionData = null;
        }
        mustMatchToken(93, "msg.no.bracket.arg", true);
        ArrayComprehension arrayComprehension = new ArrayComprehension(i, this.ts.tokenEnd - i);
        arrayComprehension.setResult(astNode);
        arrayComprehension.setLoops(arrayList);
        if (conditionData != null) {
            arrayComprehension.setIfPosition(i2);
            arrayComprehension.setFilter(conditionData.condition);
            arrayComprehension.setFilterLp(conditionData.lp - i);
            arrayComprehension.setFilterRp(conditionData.rp - i);
        }
        return arrayComprehension;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:6:0x001a, B:9:0x0023, B:11:0x0031, B:16:0x003e, B:18:0x0046, B:20:0x004d, B:26:0x005b, B:29:0x0071, B:31:0x0077, B:32:0x0082, B:44:0x00b1, B:45:0x00b8, B:47:0x00c6, B:49:0x00cd, B:53:0x00e5, B:37:0x008e, B:39:0x0095, B:42:0x00a5, B:43:0x00aa, B:27:0x0062, B:28:0x006a, B:14:0x003a), top: B:58:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:6:0x001a, B:9:0x0023, B:11:0x0031, B:16:0x003e, B:18:0x0046, B:20:0x004d, B:26:0x005b, B:29:0x0071, B:31:0x0077, B:32:0x0082, B:44:0x00b1, B:45:0x00b8, B:47:0x00c6, B:49:0x00cd, B:53:0x00e5, B:37:0x008e, B:39:0x0095, B:42:0x00a5, B:43:0x00aa, B:27:0x0062, B:28:0x006a, B:14:0x003a), top: B:58:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:6:0x001a, B:9:0x0023, B:11:0x0031, B:16:0x003e, B:18:0x0046, B:20:0x004d, B:26:0x005b, B:29:0x0071, B:31:0x0077, B:32:0x0082, B:44:0x00b1, B:45:0x00b8, B:47:0x00c6, B:49:0x00cd, B:53:0x00e5, B:37:0x008e, B:39:0x0095, B:42:0x00a5, B:43:0x00aa, B:27:0x0062, B:28:0x006a, B:14:0x003a), top: B:58:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:6:0x001a, B:9:0x0023, B:11:0x0031, B:16:0x003e, B:18:0x0046, B:20:0x004d, B:26:0x005b, B:29:0x0071, B:31:0x0077, B:32:0x0082, B:44:0x00b1, B:45:0x00b8, B:47:0x00c6, B:49:0x00cd, B:53:0x00e5, B:37:0x008e, B:39:0x0095, B:42:0x00a5, B:43:0x00aa, B:27:0x0062, B:28:0x006a, B:14:0x003a), top: B:58:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:6:0x001a, B:9:0x0023, B:11:0x0031, B:16:0x003e, B:18:0x0046, B:20:0x004d, B:26:0x005b, B:29:0x0071, B:31:0x0077, B:32:0x0082, B:44:0x00b1, B:45:0x00b8, B:47:0x00c6, B:49:0x00cd, B:53:0x00e5, B:37:0x008e, B:39:0x0095, B:42:0x00a5, B:43:0x00aa, B:27:0x0062, B:28:0x006a, B:14:0x003a), top: B:58:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.ArrayComprehensionLoop arrayComprehensionLoop() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.arrayComprehensionLoop():org.mozilla.javascript.ast.ArrayComprehensionLoop");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        r14 = r4.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
        if (r7 >= r14) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
        r6 = r4.get(r7);
        r7 = r7 + 1;
        r5.addElement((org.mozilla.javascript.ast.AstNode) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
        r5.setLength(r0 - r1);
        r5.setLineColumnNumber(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.AstNode arrayLiteral() {
        /*
            r14 = this;
            int r0 = r14.currentToken
            r1 = 92
            if (r0 == r1) goto L9
            r14.codeBug()
        L9:
            org.mozilla.javascript.TokenStream r0 = r14.ts
            int r1 = r0.tokenBeg
            int r0 = r0.tokenEnd
            int r2 = r14.lineNumber()
            int r3 = r14.columnNumber()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            org.mozilla.javascript.ast.ArrayLiteral r5 = new org.mozilla.javascript.ast.ArrayLiteral
            r5.<init>(r1)
            r6 = -1
            r7 = 0
            r8 = 1
            r11 = r6
            r10 = r7
        L26:
            r9 = r8
        L27:
            int r12 = r14.peekToken()
            r13 = 98
            if (r12 != r13) goto L48
            r14.consumeToken()
            org.mozilla.javascript.TokenStream r11 = r14.ts
            int r11 = r11.tokenEnd
            if (r9 != 0) goto L39
            goto L26
        L39:
            org.mozilla.javascript.ast.EmptyExpression r12 = new org.mozilla.javascript.ast.EmptyExpression
            org.mozilla.javascript.TokenStream r13 = r14.ts
            int r13 = r13.tokenBeg
            r12.<init>(r13, r8)
            r4.add(r12)
            int r10 = r10 + 1
            goto L27
        L48:
            r13 = 175(0xaf, float:2.45E-43)
            if (r12 != r13) goto L50
            r14.consumeToken()
            goto L27
        L50:
            r13 = 93
            if (r12 != r13) goto L6c
            r14.consumeToken()
            org.mozilla.javascript.TokenStream r0 = r14.ts
            int r0 = r0.tokenEnd
            int r8 = r4.size()
            int r8 = r8 + r9
            r5.setDestructuringLength(r8)
            r5.setSkipCount(r10)
            if (r11 == r6) goto L8a
            r14.warnTrailingComma(r1, r4, r11)
            goto L8a
        L6c:
            r11 = 132(0x84, float:1.85E-43)
            if (r12 != r11) goto L83
            if (r9 != 0) goto L83
            int r11 = r4.size()
            if (r11 != r8) goto L83
            java.lang.Object r0 = r4.get(r7)
            org.mozilla.javascript.ast.AstNode r0 = (org.mozilla.javascript.ast.AstNode) r0
            org.mozilla.javascript.ast.AstNode r14 = r14.arrayComprehension(r0, r1)
            return r14
        L83:
            java.lang.String r11 = "msg.no.bracket.arg"
            if (r12 != 0) goto La4
            r14.reportError(r11)
        L8a:
            int r14 = r4.size()
        L8e:
            if (r7 >= r14) goto L9c
            java.lang.Object r6 = r4.get(r7)
            int r7 = r7 + 1
            org.mozilla.javascript.ast.AstNode r6 = (org.mozilla.javascript.ast.AstNode) r6
            r5.addElement(r6)
            goto L8e
        L9c:
            int r0 = r0 - r1
            r5.setLength(r0)
            r5.setLineColumnNumber(r2, r3)
            return r5
        La4:
            if (r9 != 0) goto La9
            r14.reportError(r11)
        La9:
            org.mozilla.javascript.ast.AstNode r9 = r14.assignExpr()
            r4.add(r9)
            r11 = r6
            r9 = r7
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.arrayLiteral():org.mozilla.javascript.ast.AstNode");
    }

    private AstNode arrowFunction(AstNode astNode, int i, int i2) {
        int i3;
        Parser parser;
        int lineNumber = lineNumber();
        if (astNode != null) {
            i3 = astNode.getPosition();
        } else {
            i3 = -1;
        }
        FunctionNode functionNode = new FunctionNode(i3);
        functionNode.setFunctionType(4);
        functionNode.setJsDocNode(getAndResetJsDoc());
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashSet hashSet = new HashSet();
        PerFunctionVariables perFunctionVariables = new PerFunctionVariables(functionNode);
        try {
            if (astNode instanceof ParenthesizedExpression) {
                functionNode.setParens(0, astNode.getLength());
                if (astNode.getIntProp(28, 0) == 1) {
                    functionNode.putIntProp(28, 1);
                }
                AstNode expression = ((ParenthesizedExpression) astNode).getExpression();
                if (!(expression instanceof EmptyExpression)) {
                    parser = this;
                    parser.arrowFunctionParams(functionNode, expression, hashMap, hashMap2, hashSet);
                } else {
                    parser = this;
                }
            } else {
                parser = this;
                parser.arrowFunctionParams(functionNode, astNode, hashMap, hashMap2, hashSet);
            }
            if (!hashMap.isEmpty()) {
                Node node = new Node(98);
                for (Map.Entry entry : hashMap.entrySet()) {
                    node.addChildToBack(parser.createDestructuringAssignment(Token.VAR, (Node) entry.getValue(), parser.createName((String) entry.getKey()), (AstNode) hashMap2.get(entry.getKey())));
                }
                functionNode.putProp(23, node);
            }
            AstNode parseFunctionBody = parser.parseFunctionBody(4, functionNode);
            functionNode.setBody(parseFunctionBody);
            int position = parseFunctionBody.getPosition() + i3 + parseFunctionBody.getLength();
            functionNode.setRawSourceBounds(i3, position);
            functionNode.setLength(position - i3);
            perFunctionVariables.restore();
            if (functionNode.isGenerator()) {
                parser.reportError("msg.arrowfunction.generator");
                return parser.makeErrorNode();
            }
            functionNode.setSourceName(parser.sourceURI);
            functionNode.setBaseLineno(lineNumber);
            functionNode.setEndLineno(parser.lineNumber());
            functionNode.setLineColumnNumber(i, i2);
            return functionNode;
        } catch (Throwable th) {
            perFunctionVariables.restore();
            throw th;
        }
    }

    private void arrowFunctionParams(FunctionNode functionNode, AstNode astNode, Map<String, Node> map, Map<String, AstNode> map2, Set<String> set) {
        if (!(astNode instanceof ArrayLiteral) && !(astNode instanceof ObjectLiteral)) {
            if ((astNode instanceof InfixExpression) && astNode.getType() == 98) {
                InfixExpression infixExpression = (InfixExpression) astNode;
                arrowFunctionParams(functionNode, infixExpression.getLeft(), map, map2, set);
                arrowFunctionParams(functionNode, infixExpression.getRight(), map, map2, set);
                return;
            } else if (astNode instanceof Name) {
                functionNode.addParam(astNode);
                String identifier = ((Name) astNode).getIdentifier();
                defineSymbol(96, identifier);
                if (this.inUseStrictDirective) {
                    if ("eval".equals(identifier) || "arguments".equals(identifier)) {
                        reportError("msg.bad.id.strict", identifier);
                    }
                    if (set.contains(identifier)) {
                        addError("msg.dup.param.strict", identifier);
                    }
                    set.add(identifier);
                    return;
                }
                return;
            } else if (astNode instanceof Assignment) {
                if (this.compilerEnv.getLanguageVersion() >= 200) {
                    Assignment assignment = (Assignment) astNode;
                    AstNode right = assignment.getRight();
                    AstNode left = assignment.getLeft();
                    if (left instanceof Name) {
                        functionNode.putDefaultParams(((Name) left).getIdentifier(), right);
                        arrowFunctionParams(functionNode, left, map, map2, set);
                        return;
                    } else if (!(left instanceof ArrayLiteral) && !(left instanceof ObjectLiteral)) {
                        reportError("msg.no.parm", astNode.getPosition(), astNode.getLength());
                        functionNode.addParam(makeErrorNode());
                        return;
                    } else {
                        markDestructuring(left);
                        functionNode.addParam(left);
                        String nextTempName = this.currentScriptOrFn.getNextTempName();
                        defineSymbol(96, nextTempName, false);
                        map.put(nextTempName, left);
                        map2.put(nextTempName, right);
                        return;
                    }
                }
                reportError("msg.default.args");
                return;
            } else {
                reportError("msg.no.parm", astNode.getPosition(), astNode.getLength());
                functionNode.addParam(makeErrorNode());
                return;
            }
        }
        markDestructuring(astNode);
        functionNode.addParam(astNode);
        String nextTempName2 = this.currentScriptOrFn.getNextTempName();
        defineSymbol(96, nextTempName2, false);
        map.put(nextTempName2, astNode);
    }

    private AstNode assignExpr() {
        boolean z;
        int peekToken = peekToken();
        if (peekToken == 78) {
            return returnOrYield(peekToken, true);
        }
        TokenStream tokenStream = this.ts;
        int i = tokenStream.lineno;
        int tokenColumn = tokenStream.getTokenColumn();
        AstNode condExpr = condExpr();
        int peekTokenOrEOL = peekTokenOrEOL();
        if (peekTokenOrEOL == 1) {
            peekTokenOrEOL = peekToken();
            z = true;
        } else {
            z = false;
        }
        if (99 <= peekTokenOrEOL && peekTokenOrEOL <= 114) {
            consumeToken();
            Comment andResetJsDoc = getAndResetJsDoc();
            markDestructuring(condExpr);
            int i2 = this.ts.tokenBeg;
            if (isNotValidSimpleAssignmentTarget(condExpr)) {
                reportError("msg.syntax.invalid.assignment.lhs");
            }
            Assignment assignment = new Assignment(peekTokenOrEOL, condExpr, assignExpr(), i2);
            if (andResetJsDoc != null) {
                assignment.setJsDocNode(andResetJsDoc);
            }
            return assignment;
        }
        if (peekTokenOrEOL == 91) {
            if (this.currentJsDocComment != null) {
                condExpr.setJsDocNode(getAndResetJsDoc());
                return condExpr;
            }
        } else if (!z && peekTokenOrEOL == 178) {
            consumeToken();
            return arrowFunction(condExpr, i, tokenColumn);
        } else if (condExpr.getIntProp(29, 0) == 1 && !this.inDestructuringAssignment) {
            reportError("msg.syntax");
        }
        return condExpr;
    }

    private AstNode attributeAccess() {
        int nextToken = nextToken();
        int i = this.ts.tokenBeg;
        if (nextToken != 23) {
            if (nextToken != 44) {
                if (nextToken != 92) {
                    reportError("msg.no.name.after.xmlAttr");
                    return makeErrorNode();
                }
                return xmlElemRef(i, null, -1);
            }
            return propertyName(i, 0);
        }
        saveNameTokenData(i, "*", lineNumber(), columnNumber());
        return propertyName(i, 0);
    }

    private void autoInsertSemicolon(AstNode astNode) {
        int peekFlaggedToken = peekFlaggedToken();
        int position = astNode.getPosition();
        int i = CLEAR_TI_MASK & peekFlaggedToken;
        if (i != -1 && i != 0) {
            if (i != 91) {
                if (i != 95) {
                    if ((peekFlaggedToken & 65536) == 0) {
                        reportError("msg.no.semi.stmt");
                        return;
                    } else {
                        warnMissingSemi(position, nodeEnd(astNode));
                        return;
                    }
                }
            } else {
                consumeToken();
                astNode.setLength(this.ts.tokenEnd - position);
                return;
            }
        }
        warnMissingSemi(position, Math.max(position + 1, nodeEnd(astNode)));
    }

    private AstNode bitAndExpr() {
        AstNode eqExpr = eqExpr();
        while (matchToken(11, true)) {
            eqExpr = new InfixExpression(11, eqExpr, eqExpr(), this.ts.tokenBeg);
        }
        return eqExpr;
    }

    private AstNode bitOrExpr() {
        AstNode bitXorExpr = bitXorExpr();
        while (matchToken(9, true)) {
            bitXorExpr = new InfixExpression(9, bitXorExpr, bitXorExpr(), this.ts.tokenBeg);
        }
        return bitXorExpr;
    }

    private AstNode bitXorExpr() {
        AstNode bitAndExpr = bitAndExpr();
        while (matchToken(10, true)) {
            bitAndExpr = new InfixExpression(10, bitAndExpr, bitAndExpr(), this.ts.tokenBeg);
        }
        return bitAndExpr;
    }

    private AstNode block() {
        if (this.currentToken != 94) {
            codeBug();
        }
        consumeToken();
        int i = this.ts.tokenBeg;
        Scope scope = new Scope(i);
        scope.setLineColumnNumber(lineNumber(), columnNumber());
        pushScope(scope);
        try {
            statements(scope);
            mustMatchToken(95, "msg.no.brace.block", true);
            scope.setLength(this.ts.tokenEnd - i);
            return scope;
        } finally {
            popScope();
        }
    }

    private BreakStatement breakStatement() {
        int i;
        Name name;
        List<Jump> list;
        if (this.currentToken != 133) {
            codeBug();
        }
        consumeToken();
        int lineNumber = lineNumber();
        TokenStream tokenStream = this.ts;
        int i2 = tokenStream.tokenBeg;
        int i3 = tokenStream.tokenEnd;
        int columnNumber = columnNumber();
        Jump jump = null;
        if (peekTokenOrEOL() == 44) {
            name = createNameNode();
            i = getNodeEnd(name);
        } else {
            i = i3;
            name = null;
        }
        LabeledStatement matchJumpLabelName = matchJumpLabelName();
        if (matchJumpLabelName != null) {
            jump = matchJumpLabelName.getFirstLabel();
        }
        if (jump == null && name == null) {
            List<Jump> list2 = this.loopAndSwitchSet;
            if (list2 != null && list2.size() != 0) {
                jump = this.loopAndSwitchSet.get(list.size() - 1);
            } else {
                reportError("msg.bad.break", i2, i - i2);
            }
        }
        if (name != null) {
            name.setLineColumnNumber(lineNumber(), columnNumber());
        }
        BreakStatement breakStatement = new BreakStatement(i2, i - i2);
        breakStatement.setBreakLabel(name);
        if (jump != null) {
            breakStatement.setBreakTarget(jump);
        }
        breakStatement.setLineColumnNumber(lineNumber, columnNumber);
        return breakStatement;
    }

    private void checkBadIncDec(UpdateExpression updateExpression) {
        String str;
        int type = removeParens(updateExpression.getOperand()).getType();
        if (type != 44 && type != 33 && type != 39 && type != 73 && type != 43) {
            if (updateExpression.getType() == 119) {
                str = "msg.bad.incr";
            } else {
                str = "msg.bad.decr";
            }
            reportError(str);
        }
    }

    private void checkCallRequiresActivation(AstNode astNode) {
        if ((astNode.getType() == 44 && "eval".equals(((Name) astNode).getIdentifier())) || (astNode.getType() == 33 && "eval".equals(((PropertyGet) astNode).getProperty().getIdentifier()))) {
            setRequiresActivation();
        }
    }

    private RuntimeException codeBug() {
        TokenStream tokenStream = this.ts;
        int i = tokenStream.cursor;
        int i2 = tokenStream.tokenBeg;
        int i3 = this.currentToken;
        StringBuilder r = hl5.r(i, i2, "ts.cursor=", ", ts.tokenBeg=", ", currentToken=");
        r.append(i3);
        throw Kit.codeBug(r.toString());
    }

    private int columnNumber() {
        return this.lastTokenColumn;
    }

    private AstNode condExpr() {
        int i;
        AstNode nullishCoalescingExpr = nullishCoalescingExpr();
        if (matchToken(Token.HOOK, true)) {
            int i2 = this.ts.tokenBeg;
            boolean z = this.inForInit;
            this.inForInit = false;
            try {
                AstNode assignExpr = assignExpr();
                this.inForInit = z;
                if (mustMatchToken(Token.COLON, "msg.no.colon.cond", true)) {
                    i = this.ts.tokenBeg;
                } else {
                    i = -1;
                }
                AstNode assignExpr2 = assignExpr();
                int position = nullishCoalescingExpr.getPosition();
                ConditionalExpression conditionalExpression = new ConditionalExpression(position, getNodeEnd(assignExpr2) - position);
                conditionalExpression.setLineColumnNumber(nullishCoalescingExpr.getLineno(), nullishCoalescingExpr.getColumn());
                conditionalExpression.setTestExpression(nullishCoalescingExpr);
                conditionalExpression.setTrueExpression(assignExpr);
                conditionalExpression.setFalseExpression(assignExpr2);
                conditionalExpression.setQuestionMarkPosition(i2 - position);
                conditionalExpression.setColonPosition(i - position);
                return conditionalExpression;
            } catch (Throwable th) {
                this.inForInit = z;
                throw th;
            }
        }
        return nullishCoalescingExpr;
    }

    private ConditionData condition() {
        ConditionData conditionData = new ConditionData(0);
        if (mustMatchToken(96, "msg.no.paren.cond", true)) {
            conditionData.lp = this.ts.tokenBeg;
        }
        conditionData.condition = expr(false);
        if (mustMatchToken(97, "msg.no.paren.after.cond", true)) {
            conditionData.rp = this.ts.tokenBeg;
        }
        AstNode astNode = conditionData.condition;
        if (astNode instanceof Assignment) {
            addStrictWarning("msg.equal.as.assign", "", astNode.getPosition(), conditionData.condition.getLength());
        }
        return conditionData;
    }

    private void consumeToken() {
        this.currentFlaggedToken = 0;
        this.lastTokenLineno = this.ts.getTokenStartLineno();
        this.lastTokenColumn = this.ts.getTokenColumn();
    }

    private ContinueStatement continueStatement() {
        int i;
        Name name;
        List<Loop> list;
        if (this.currentToken != 134) {
            codeBug();
        }
        consumeToken();
        int lineNumber = lineNumber();
        TokenStream tokenStream = this.ts;
        int i2 = tokenStream.tokenBeg;
        int i3 = tokenStream.tokenEnd;
        int columnNumber = columnNumber();
        Loop loop = null;
        if (peekTokenOrEOL() == 44) {
            name = createNameNode();
            i = getNodeEnd(name);
        } else {
            i = i3;
            name = null;
        }
        LabeledStatement matchJumpLabelName = matchJumpLabelName();
        if (matchJumpLabelName == null && name == null) {
            List<Loop> list2 = this.loopSet;
            if (list2 != null && list2.size() != 0) {
                loop = this.loopSet.get(list.size() - 1);
            } else {
                reportError("msg.continue.outside");
            }
        } else {
            if (matchJumpLabelName == null || !(matchJumpLabelName.getStatement() instanceof Loop)) {
                reportError("msg.continue.nonloop", i2, i - i2);
            }
            if (matchJumpLabelName != null) {
                loop = (Loop) matchJumpLabelName.getStatement();
            }
        }
        if (name != null) {
            name.setLineColumnNumber(lineNumber(), columnNumber());
        }
        ContinueStatement continueStatement = new ContinueStatement(i2, i - i2);
        if (loop != null) {
            continueStatement.setTarget(loop);
        }
        continueStatement.setLabel(name);
        continueStatement.setLineColumnNumber(lineNumber, columnNumber);
        return continueStatement;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.Name createNameNode(boolean r7, int r8) {
        /*
            r6 = this;
            org.mozilla.javascript.TokenStream r0 = r6.ts
            int r1 = r0.tokenBeg
            java.lang.String r0 = r0.getString()
            int r2 = r6.lineNumber()
            int r3 = r6.columnNumber()
            java.lang.String r4 = r6.prevNameTokenString
            java.lang.String r5 = ""
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L2b
            int r1 = r6.prevNameTokenStart
            java.lang.String r0 = r6.prevNameTokenString
            int r2 = r6.prevNameTokenLineno
            int r3 = r6.prevNameTokenColumn
            r4 = 0
            r6.prevNameTokenStart = r4
            r6.prevNameTokenString = r5
            r6.prevNameTokenLineno = r4
            r6.prevNameTokenColumn = r4
        L2b:
            if (r0 != 0) goto L39
            org.mozilla.javascript.CompilerEnvirons r4 = r6.compilerEnv
            boolean r4 = r4.isIdeMode()
            if (r4 == 0) goto L36
            goto L3a
        L36:
            r6.codeBug()
        L39:
            r5 = r0
        L3a:
            org.mozilla.javascript.ast.Name r0 = new org.mozilla.javascript.ast.Name
            r0.<init>(r1, r5)
            r0.setLineColumnNumber(r2, r3)
            if (r7 == 0) goto L47
            r6.checkActivationName(r5, r8)
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.createNameNode(boolean, int):org.mozilla.javascript.ast.Name");
    }

    private AstNode createNumericLiteral(int i, boolean z) {
        AstNode numberLiteral;
        String string = this.ts.getString();
        if (this.inUseStrictDirective && this.ts.isNumericOldOctal() && (this.compilerEnv.getLanguageVersion() >= 200 || !z)) {
            if (i == 89) {
                reportError("msg.no.old.octal.bigint");
            } else {
                reportError("msg.no.old.octal.strict");
            }
        }
        if (this.compilerEnv.getLanguageVersion() >= 200 || !z) {
            if (this.ts.isNumericBinary()) {
                string = s21.m("0b", string);
            } else if (this.ts.isNumericOldOctal()) {
                string = s21.m("0", string);
            } else if (this.ts.isNumericOctal()) {
                string = s21.m("0o", string);
            } else if (this.ts.isNumericHex()) {
                string = s21.m("0x", string);
            }
        }
        if (i == 89) {
            numberLiteral = new BigIntLiteral(this.ts.tokenBeg, nk2.u(string, "n"), this.ts.getBigInt());
        } else {
            TokenStream tokenStream = this.ts;
            numberLiteral = new NumberLiteral(tokenStream.tokenBeg, string, tokenStream.getNumber());
        }
        numberLiteral.setLineColumnNumber(lineNumber(), columnNumber());
        return numberLiteral;
    }

    private StringLiteral createStringLiteral() {
        TokenStream tokenStream = this.ts;
        int i = tokenStream.tokenBeg;
        StringLiteral stringLiteral = new StringLiteral(i, tokenStream.tokenEnd - i);
        stringLiteral.setLineColumnNumber(lineNumber(), columnNumber());
        stringLiteral.setValue(this.ts.getString());
        stringLiteral.setQuoteCharacter(this.ts.getQuoteChar());
        return stringLiteral;
    }

    private TemplateCharacters createTemplateLiteralCharacters(int i) {
        TemplateCharacters templateCharacters = new TemplateCharacters(i, (this.ts.tokenEnd - i) - 1);
        templateCharacters.setValue(this.ts.getString());
        templateCharacters.setRawValue(this.ts.getRawString());
        return templateCharacters;
    }

    private AstNode defaultXmlNamespace() {
        if (this.currentToken != 129) {
            codeBug();
        }
        consumeToken();
        mustHaveXML();
        setRequiresActivation();
        int lineNumber = lineNumber();
        int columnNumber = columnNumber();
        int i = this.ts.tokenBeg;
        if (!matchToken(44, true) || !"xml".equals(this.ts.getString())) {
            reportError("msg.bad.namespace");
        }
        if (!matchToken(44, true) || !"namespace".equals(this.ts.getString())) {
            reportError("msg.bad.namespace");
        }
        if (!matchToken(99, true)) {
            reportError("msg.bad.namespace");
        }
        AstNode expr = expr(false);
        UnaryExpression unaryExpression = new UnaryExpression(i, getNodeEnd(expr) - i);
        unaryExpression.setOperator(82);
        unaryExpression.setOperand(expr);
        unaryExpression.setLineColumnNumber(lineNumber, columnNumber);
        return new ExpressionStatement((AstNode) unaryExpression, true);
    }

    private AstNode destructuringAssignExpr() {
        try {
            this.inDestructuringAssignment = true;
            return assignExpr();
        } finally {
            this.inDestructuringAssignment = false;
        }
    }

    private AstNode destructuringPrimaryExpr() {
        try {
            this.inDestructuringAssignment = true;
            return primaryExpr();
        } finally {
            this.inDestructuringAssignment = false;
        }
    }

    private DoLoop doLoop() {
        if (this.currentToken != 131) {
            codeBug();
        }
        consumeToken();
        int i = this.ts.tokenBeg;
        DoLoop doLoop = new DoLoop(i);
        doLoop.setLineColumnNumber(lineNumber(), columnNumber());
        enterLoop(doLoop);
        try {
            AstNode nextStatementAfterInlineComments = getNextStatementAfterInlineComments(doLoop);
            mustMatchToken(130, "msg.no.while.do", true);
            doLoop.setWhilePosition(this.ts.tokenBeg - i);
            ConditionData condition = condition();
            doLoop.setCondition(condition.condition);
            doLoop.setParens(condition.lp - i, condition.rp - i);
            int nodeEnd = getNodeEnd(nextStatementAfterInlineComments);
            restoreRelativeLoopPosition(doLoop);
            doLoop.setBody(nextStatementAfterInlineComments);
            exitLoop();
            if (matchToken(91, true)) {
                nodeEnd = this.ts.tokenEnd;
            }
            doLoop.setLength(nodeEnd - i);
            return doLoop;
        } catch (Throwable th) {
            exitLoop();
            throw th;
        }
    }

    private void enterLoop(Loop loop) {
        if (this.loopSet == null) {
            this.loopSet = new ArrayList();
        }
        this.loopSet.add(loop);
        if (this.loopAndSwitchSet == null) {
            this.loopAndSwitchSet = new ArrayList();
        }
        this.loopAndSwitchSet.add(loop);
        pushScope(loop);
        LabeledStatement labeledStatement = this.currentLabel;
        if (labeledStatement != null) {
            labeledStatement.setStatement(loop);
            this.currentLabel.getFirstLabel().setLoop(loop);
            loop.setRelative(-this.currentLabel.getPosition());
        }
    }

    private void enterSwitch(SwitchStatement switchStatement) {
        if (this.loopAndSwitchSet == null) {
            this.loopAndSwitchSet = new ArrayList();
        }
        this.loopAndSwitchSet.add(switchStatement);
    }

    private AstNode eqExpr() {
        AstNode relExpr = relExpr();
        while (true) {
            int peekToken = peekToken();
            int i = this.ts.tokenBeg;
            if (peekToken != 12 && peekToken != 13 && peekToken != 51 && peekToken != 52) {
                return relExpr;
            }
            consumeToken();
            if (this.compilerEnv.getLanguageVersion() == 120) {
                if (peekToken == 12) {
                    peekToken = 51;
                } else if (peekToken == 13) {
                    peekToken = 52;
                }
            }
            relExpr = new InfixExpression(peekToken, relExpr, relExpr(), i);
        }
    }

    private void exitLoop() {
        List<Loop> list = this.loopSet;
        list.remove(list.size() - 1);
        List<Jump> list2 = this.loopAndSwitchSet;
        list2.remove(list2.size() - 1);
        popScope();
    }

    private void exitSwitch() {
        List<Jump> list = this.loopAndSwitchSet;
        list.remove(list.size() - 1);
    }

    private AstNode expExpr() {
        AstNode unaryExpr = unaryExpr();
        while (true) {
            int peekToken = peekToken();
            int i = this.ts.tokenBeg;
            if (peekToken != 81) {
                return unaryExpr;
            }
            if (unaryExpr instanceof UnaryExpression) {
                reportError("msg.no.unary.expr.on.left.exp", AstNode.operatorToString(unaryExpr.getType()));
                return makeErrorNode();
            }
            consumeToken();
            unaryExpr = new InfixExpression(peekToken, unaryExpr, expExpr(), i);
        }
    }

    private AstNode expr(boolean z) {
        AstNode assignExpr = assignExpr();
        int position = assignExpr.getPosition();
        while (matchToken(98, true)) {
            int i = this.ts.tokenBeg;
            if (this.compilerEnv.isStrictMode() && !assignExpr.hasSideEffects()) {
                addStrictWarning("msg.no.side.effects", "", position, nodeEnd(assignExpr) - position);
            }
            if (peekToken() == 78) {
                reportError("msg.yield.parenthesized");
            }
            if (z && peekToken() == 97) {
                assignExpr.putIntProp(28, 1);
                return assignExpr;
            }
            assignExpr = new InfixExpression(98, assignExpr, assignExpr(), i);
        }
        return assignExpr;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0043, TryCatch #2 {all -> 0x0043, blocks: (B:6:0x0025, B:9:0x002e, B:11:0x003c, B:16:0x004b, B:18:0x0053, B:20:0x005a, B:22:0x006d, B:40:0x0105, B:42:0x010d, B:47:0x0119, B:57:0x015f, B:59:0x017c, B:48:0x0128, B:50:0x0131, B:52:0x013e, B:55:0x0147, B:56:0x014c, B:23:0x007e, B:25:0x0088, B:27:0x008e, B:29:0x009c, B:30:0x00ac, B:32:0x00b9, B:35:0x00d8, B:37:0x00e7, B:39:0x0100, B:34:0x00d3, B:14:0x0046, B:58:0x016a), top: B:72:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[Catch: all -> 0x0043, TryCatch #2 {all -> 0x0043, blocks: (B:6:0x0025, B:9:0x002e, B:11:0x003c, B:16:0x004b, B:18:0x0053, B:20:0x005a, B:22:0x006d, B:40:0x0105, B:42:0x010d, B:47:0x0119, B:57:0x015f, B:59:0x017c, B:48:0x0128, B:50:0x0131, B:52:0x013e, B:55:0x0147, B:56:0x014c, B:23:0x007e, B:25:0x0088, B:27:0x008e, B:29:0x009c, B:30:0x00ac, B:32:0x00b9, B:35:0x00d8, B:37:0x00e7, B:39:0x0100, B:34:0x00d3, B:14:0x0046, B:58:0x016a), top: B:72:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: all -> 0x0043, TryCatch #2 {all -> 0x0043, blocks: (B:6:0x0025, B:9:0x002e, B:11:0x003c, B:16:0x004b, B:18:0x0053, B:20:0x005a, B:22:0x006d, B:40:0x0105, B:42:0x010d, B:47:0x0119, B:57:0x015f, B:59:0x017c, B:48:0x0128, B:50:0x0131, B:52:0x013e, B:55:0x0147, B:56:0x014c, B:23:0x007e, B:25:0x0088, B:27:0x008e, B:29:0x009c, B:30:0x00ac, B:32:0x00b9, B:35:0x00d8, B:37:0x00e7, B:39:0x0100, B:34:0x00d3, B:14:0x0046, B:58:0x016a), top: B:72:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d A[Catch: all -> 0x0043, TryCatch #2 {all -> 0x0043, blocks: (B:6:0x0025, B:9:0x002e, B:11:0x003c, B:16:0x004b, B:18:0x0053, B:20:0x005a, B:22:0x006d, B:40:0x0105, B:42:0x010d, B:47:0x0119, B:57:0x015f, B:59:0x017c, B:48:0x0128, B:50:0x0131, B:52:0x013e, B:55:0x0147, B:56:0x014c, B:23:0x007e, B:25:0x0088, B:27:0x008e, B:29:0x009c, B:30:0x00ac, B:32:0x00b9, B:35:0x00d8, B:37:0x00e7, B:39:0x0100, B:34:0x00d3, B:14:0x0046, B:58:0x016a), top: B:72:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.Loop forLoop() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.forLoop():org.mozilla.javascript.ast.Loop");
    }

    private AstNode forLoopInit(int i) {
        AstNode variables;
        try {
            this.inForInit = true;
            if (i == 91) {
                variables = new EmptyExpression(this.ts.tokenBeg, 1);
                variables.setLineColumnNumber(this.ts.getLineno(), this.ts.getTokenColumn());
            } else {
                if (i != 135 && i != 167) {
                    variables = expr(false);
                }
                consumeToken();
                variables = variables(i, this.ts.tokenBeg, false);
            }
            this.inForInit = false;
            return variables;
        } catch (Throwable th) {
            this.inForInit = false;
            throw th;
        }
    }

    private FunctionNode function(int i, boolean z) {
        AstNode astNode;
        Name createNameNode;
        int i2;
        int i3;
        String str;
        String identifier;
        AstNode astNode2;
        int lineNumber = lineNumber();
        int i4 = this.ts.tokenBeg;
        int columnNumber = columnNumber();
        boolean z2 = false;
        while (true) {
            astNode = null;
            if (matchToken(44, true)) {
                createNameNode = createNameNode(true, 44);
                if (this.inUseStrictDirective) {
                    String identifier2 = createNameNode.getIdentifier();
                    if ("eval".equals(identifier2) || "arguments".equals(identifier2)) {
                        reportError("msg.bad.id.strict", identifier2);
                    }
                }
                if (!matchToken(96, true)) {
                    if (this.compilerEnv.isAllowMemberExprAsFunctionName()) {
                        AstNode memberExprTail = memberExprTail(false, createNameNode);
                        createNameNode = null;
                        astNode = memberExprTail;
                    }
                    mustMatchToken(96, "msg.no.paren.parms", true);
                }
            } else if (matchToken(96, true)) {
                createNameNode = null;
                break;
            } else if (!matchToken(23, true) || this.compilerEnv.getLanguageVersion() < 200) {
                break;
            } else {
                z2 = true;
            }
        }
        if (this.compilerEnv.isAllowMemberExprAsFunctionName()) {
            astNode2 = memberExpr(false);
        } else {
            astNode2 = null;
        }
        mustMatchToken(96, "msg.no.paren.parms", true);
        createNameNode = null;
        astNode = astNode2;
        if (this.currentToken == 96) {
            i2 = this.ts.tokenBeg;
        } else {
            i2 = -1;
        }
        if (astNode != null) {
            i3 = 2;
        } else {
            i3 = i;
        }
        if (i3 != 2 && createNameNode != null && createNameNode.length() > 0) {
            defineSymbol(Token.FUNCTION, createNameNode.getIdentifier());
        }
        FunctionNode functionNode = new FunctionNode(i4, createNameNode);
        functionNode.setMethodDefinition(z);
        functionNode.setFunctionType(i);
        if (z2) {
            functionNode.setIsES6Generator();
        }
        if (i2 != -1) {
            functionNode.setLp(i2 - i4);
        }
        functionNode.setJsDocNode(getAndResetJsDoc());
        PerFunctionVariables perFunctionVariables = new PerFunctionVariables(functionNode);
        boolean z3 = this.insideMethod;
        this.insideMethod = z;
        try {
            parseFunctionParams(functionNode);
            AstNode parseFunctionBody = parseFunctionBody(i, functionNode);
            functionNode.setBody(parseFunctionBody);
            int position = parseFunctionBody.getPosition() + i4 + parseFunctionBody.getLength();
            functionNode.setRawSourceBounds(i4, position);
            functionNode.setLength(position - i4);
            if (this.compilerEnv.isStrictMode() && !functionNode.getBody().hasConsistentReturnUsage()) {
                if (createNameNode != null && createNameNode.length() > 0) {
                    str = "msg.no.return.value";
                } else {
                    str = "msg.anon.no.return.value";
                }
                if (createNameNode == null) {
                    identifier = "";
                } else {
                    identifier = createNameNode.getIdentifier();
                }
                addStrictWarning(str, identifier);
            }
            perFunctionVariables.restore();
            this.insideMethod = z3;
            if (astNode != null) {
                Kit.codeBug();
                functionNode.setMemberExprNode(astNode);
            }
            functionNode.setSourceName(this.sourceURI);
            functionNode.setLineColumnNumber(lineNumber, columnNumber);
            functionNode.setEndLineno(lineNumber());
            if (this.compilerEnv.isIdeMode()) {
                functionNode.setParentScope(this.currentScope);
            }
            return functionNode;
        } catch (Throwable th) {
            perFunctionVariables.restore();
            this.insideMethod = z3;
            throw th;
        }
    }

    private AstNode generatorExpression(AstNode astNode, int i, boolean z) {
        int i2;
        ConditionData conditionData;
        ArrayList arrayList = new ArrayList();
        while (peekToken() == 132) {
            arrayList.add(generatorExpressionLoop());
        }
        if (peekToken() == 125) {
            consumeToken();
            i2 = this.ts.tokenBeg - i;
            conditionData = condition();
        } else {
            i2 = -1;
            conditionData = null;
        }
        if (!z) {
            mustMatchToken(97, "msg.no.paren.let", true);
        }
        GeneratorExpression generatorExpression = new GeneratorExpression(i, this.ts.tokenEnd - i);
        generatorExpression.setResult(astNode);
        generatorExpression.setLoops(arrayList);
        if (conditionData != null) {
            generatorExpression.setIfPosition(i2);
            generatorExpression.setFilter(conditionData.condition);
            generatorExpression.setFilterLp(conditionData.lp - i);
            generatorExpression.setFilterRp(conditionData.rp - i);
        }
        return generatorExpression;
    }

    private GeneratorExpressionLoop generatorExpressionLoop() {
        int i;
        AstNode createNameNode;
        int i2;
        if (nextToken() != 132) {
            codeBug();
        }
        int i3 = this.ts.tokenBeg;
        GeneratorExpressionLoop generatorExpressionLoop = new GeneratorExpressionLoop(i3);
        pushScope(generatorExpressionLoop);
        try {
            int i4 = -1;
            if (mustMatchToken(96, "msg.no.paren.for", true)) {
                i = this.ts.tokenBeg - i3;
            } else {
                i = -1;
            }
            int peekToken = peekToken();
            if (peekToken != 44) {
                if (peekToken != 92 && peekToken != 94) {
                    reportError("msg.bad.var");
                    createNameNode = null;
                } else {
                    createNameNode = destructuringPrimaryExpr();
                    markDestructuring(createNameNode);
                }
            } else {
                consumeToken();
                createNameNode = createNameNode();
            }
            if (createNameNode.getType() == 44) {
                defineSymbol(Token.LET, this.ts.getString(), true);
            }
            if (mustMatchToken(57, "msg.in.after.for.name", true)) {
                i2 = this.ts.tokenBeg - i3;
            } else {
                i2 = -1;
            }
            AstNode expr = expr(false);
            if (mustMatchToken(97, "msg.no.paren.for.ctrl", true)) {
                i4 = this.ts.tokenBeg - i3;
            }
            generatorExpressionLoop.setLength(this.ts.tokenEnd - i3);
            generatorExpressionLoop.setIterator(createNameNode);
            generatorExpressionLoop.setIteratedObject(expr);
            generatorExpressionLoop.setInPosition(i2);
            generatorExpressionLoop.setParens(i, i4);
            popScope();
            return generatorExpressionLoop;
        } catch (Throwable th) {
            popScope();
            throw th;
        }
    }

    private Comment getAndResetJsDoc() {
        Comment comment = this.currentJsDocComment;
        this.currentJsDocComment = null;
        return comment;
    }

    private static String getDirective(AstNode astNode) {
        if (astNode instanceof ExpressionStatement) {
            AstNode expression = ((ExpressionStatement) astNode).getExpression();
            if (expression instanceof StringLiteral) {
                return ((StringLiteral) expression).getValue();
            }
            return null;
        }
        return null;
    }

    private AstNode getNextStatementAfterInlineComments(AstNode astNode) {
        AstNode statement = statement();
        if (175 == statement.getType()) {
            AstNode statement2 = statement();
            if (astNode != null) {
                astNode.setInlineComment(statement);
                return statement2;
            }
            statement2.setInlineComment(statement);
            return statement2;
        }
        return statement;
    }

    private static int getNodeEnd(AstNode astNode) {
        return astNode.getLength() + astNode.getPosition();
    }

    public static Object getPropKey(Node node) {
        if (node instanceof Name) {
            return ScriptRuntime.getIndexObject(((Name) node).getIdentifier());
        }
        if (node instanceof StringLiteral) {
            return ScriptRuntime.getIndexObject(((StringLiteral) node).getValue());
        }
        if (node instanceof NumberLiteral) {
            return ScriptRuntime.getIndexObject(((NumberLiteral) node).getNumber());
        }
        if (node instanceof GeneratorMethodDefinition) {
            return getPropKey(((GeneratorMethodDefinition) node).getMethodName());
        }
        return null;
    }

    private IfStatement ifStatement() {
        int i;
        AstNode astNode;
        AstNode astNode2;
        if (this.currentToken != 125) {
            codeBug();
        }
        consumeToken();
        int i2 = this.ts.tokenBeg;
        int lineNumber = lineNumber();
        int columnNumber = columnNumber();
        IfStatement ifStatement = new IfStatement(i2);
        ConditionData condition = condition();
        AstNode nextStatementAfterInlineComments = getNextStatementAfterInlineComments(ifStatement);
        if (matchToken(Token.ELSE, true)) {
            if (peekToken() == 175) {
                List<Comment> list = this.scannedComments;
                ifStatement.setElseKeyWordInlineComment(list.get(list.size() - 1));
                consumeToken();
            }
            i = this.ts.tokenBeg - i2;
            astNode = statement();
        } else {
            i = -1;
            astNode = null;
        }
        if (astNode != null) {
            astNode2 = astNode;
        } else {
            astNode2 = nextStatementAfterInlineComments;
        }
        ifStatement.setLength(getNodeEnd(astNode2) - i2);
        ifStatement.setCondition(condition.condition);
        ifStatement.setParens(condition.lp - i2, condition.rp - i2);
        ifStatement.setThenPart(nextStatementAfterInlineComments);
        ifStatement.setElsePart(astNode);
        ifStatement.setElsePosition(i);
        ifStatement.setLineColumnNumber(lineNumber, columnNumber);
        return ifStatement;
    }

    private static boolean isNotValidSimpleAssignmentTarget(AstNode astNode) {
        if (astNode.getType() == 33) {
            return isNotValidSimpleAssignmentTarget(((PropertyGet) astNode).getLeft());
        }
        if (astNode.getType() == 186) {
            return true;
        }
        return false;
    }

    private AstNode let(boolean z, int i) {
        LetNode letNode = new LetNode(i);
        letNode.setLineColumnNumber(lineNumber(), columnNumber());
        if (mustMatchToken(96, "msg.no.paren.after.let", true)) {
            letNode.setLp(this.ts.tokenBeg - i);
        }
        pushScope(letNode);
        try {
            letNode.setVariables(variables(Token.LET, this.ts.tokenBeg, z));
            if (mustMatchToken(97, "msg.no.paren.let", true)) {
                letNode.setRp(this.ts.tokenBeg - i);
            }
            if (z && peekToken() == 94) {
                consumeToken();
                int i2 = this.ts.tokenBeg;
                AstNode statements = statements();
                mustMatchToken(95, "msg.no.curly.let", true);
                statements.setLength(this.ts.tokenEnd - i2);
                letNode.setLength(this.ts.tokenEnd - i);
                letNode.setBody(statements);
                letNode.setType(Token.LET);
            } else {
                AstNode expr = expr(false);
                letNode.setLength(getNodeEnd(expr) - i);
                letNode.setBody(expr);
                if (z) {
                    ExpressionStatement expressionStatement = new ExpressionStatement(letNode, !insideFunctionBody());
                    expressionStatement.setLineColumnNumber(letNode.getLineno(), letNode.getColumn());
                    popScope();
                    return expressionStatement;
                }
            }
            popScope();
            return letNode;
        } catch (Throwable th) {
            popScope();
            throw th;
        }
    }

    private AstNode letStatement() {
        AstNode variables;
        if (this.currentToken != 167) {
            codeBug();
        }
        consumeToken();
        int lineNumber = lineNumber();
        int i = this.ts.tokenBeg;
        int columnNumber = columnNumber();
        if (peekToken() == 96) {
            variables = let(true, i);
        } else {
            variables = variables(Token.LET, i, true);
        }
        variables.setLineColumnNumber(lineNumber, columnNumber);
        return variables;
    }

    private int lineBeginningFor(int i) {
        char[] cArr = this.sourceChars;
        if (cArr == null) {
            return -1;
        }
        if (i <= 0) {
            return 0;
        }
        if (i >= cArr.length) {
            i = cArr.length - 1;
        }
        while (true) {
            int i2 = i - 1;
            if (i2 < 0) {
                return 0;
            }
            if (ScriptRuntime.isJSLineTerminator(cArr[i2])) {
                return i;
            }
            i = i2;
        }
    }

    private int lineNumber() {
        return this.lastTokenLineno;
    }

    private ElementGet makeElemGet(AstNode astNode, int i) {
        int i2;
        int position = astNode.getPosition();
        AstNode expr = expr(false);
        int nodeEnd = getNodeEnd(expr);
        if (mustMatchToken(93, "msg.no.bracket.index", true)) {
            TokenStream tokenStream = this.ts;
            int i3 = tokenStream.tokenBeg;
            nodeEnd = tokenStream.tokenEnd;
            i2 = i3;
        } else {
            i2 = -1;
        }
        ElementGet elementGet = new ElementGet(position, nodeEnd - position);
        elementGet.setTarget(astNode);
        elementGet.setElement(expr);
        elementGet.setParens(i, i2);
        return elementGet;
    }

    private ErrorNode makeErrorNode() {
        TokenStream tokenStream = this.ts;
        int i = tokenStream.tokenBeg;
        ErrorNode errorNode = new ErrorNode(i, tokenStream.tokenEnd - i);
        errorNode.setLineColumnNumber(lineNumber(), columnNumber());
        return errorNode;
    }

    private FunctionCall makeFunctionCall(AstNode astNode, int i, boolean z) {
        consumeToken();
        checkCallRequiresActivation(astNode);
        FunctionCall functionCall = new FunctionCall(i);
        functionCall.setTarget(astNode);
        functionCall.setLp(this.ts.tokenBeg - i);
        List<AstNode> argumentList = argumentList();
        if (argumentList != null && argumentList.size() > 65536) {
            reportError("msg.too.many.function.args");
        }
        functionCall.setArguments(argumentList);
        functionCall.setRp(this.ts.tokenBeg - i);
        functionCall.setLength(this.ts.tokenEnd - i);
        if (z) {
            functionCall.markIsOptionalCall();
        }
        return functionCall;
    }

    private LabeledStatement matchJumpLabelName() {
        LabeledStatement labeledStatement = null;
        if (peekTokenOrEOL() == 44) {
            consumeToken();
            Map<String, LabeledStatement> map = this.labelSet;
            if (map != null) {
                labeledStatement = map.get(this.ts.getString());
            }
            if (labeledStatement == null) {
                reportError("msg.undef.label");
            }
        }
        return labeledStatement;
    }

    private boolean matchToken(int i, boolean z) {
        int peekToken = peekToken();
        while (peekToken == 175 && z) {
            consumeToken();
            peekToken = peekToken();
        }
        if (peekToken != i) {
            return false;
        }
        consumeToken();
        return true;
    }

    private AstNode memberExpr(boolean z) {
        AstNode astNode;
        if (peekToken() != 30) {
            astNode = primaryExpr();
        } else {
            consumeToken();
            int i = this.ts.tokenBeg;
            int lineNumber = lineNumber();
            int columnNumber = columnNumber();
            NewExpression newExpression = new NewExpression(i);
            AstNode memberExpr = memberExpr(false);
            int nodeEnd = getNodeEnd(memberExpr);
            newExpression.setTarget(memberExpr);
            newExpression.setLineColumnNumber(lineNumber, columnNumber);
            if (matchToken(96, true)) {
                int i2 = this.ts.tokenBeg;
                List<AstNode> argumentList = argumentList();
                if (argumentList != null && argumentList.size() > 65536) {
                    reportError("msg.too.many.constructor.args");
                }
                TokenStream tokenStream = this.ts;
                int i3 = tokenStream.tokenBeg;
                nodeEnd = tokenStream.tokenEnd;
                if (argumentList != null) {
                    newExpression.setArguments(argumentList);
                }
                newExpression.setParens(i2 - i, i3 - i);
            }
            if (matchToken(94, true)) {
                ObjectLiteral objectLiteral = objectLiteral();
                nodeEnd = getNodeEnd(objectLiteral);
                newExpression.setInitializer(objectLiteral);
            }
            newExpression.setLength(nodeEnd - i);
            astNode = newExpression;
        }
        return memberExprTail(z, astNode);
    }

    private AstNode memberExprTail(boolean z, AstNode astNode) {
        int i;
        if (astNode == null) {
            codeBug();
        }
        int position = astNode.getPosition();
        boolean z2 = false;
        while (true) {
            int lineNumber = lineNumber();
            int columnNumber = columnNumber();
            int peekToken = peekToken();
            if (peekToken != 92) {
                if (peekToken != 96) {
                    boolean z3 = true;
                    if (peekToken != 121 && peekToken != 157) {
                        if (peekToken != 160) {
                            if (peekToken != 175) {
                                if (peekToken != 180) {
                                    if (peekToken != 186) {
                                        break;
                                    }
                                } else {
                                    consumeToken();
                                    astNode = taggedTemplateLiteral(astNode);
                                }
                            } else {
                                int i2 = this.currentFlaggedToken;
                                peekUntilNonComment(peekToken);
                                int i3 = this.currentFlaggedToken;
                                if ((65536 & i3) != 0) {
                                    i2 = i3;
                                }
                                this.currentFlaggedToken = i2;
                            }
                        } else {
                            consumeToken();
                            int i4 = this.ts.tokenBeg;
                            mustHaveXML();
                            setRequiresActivation();
                            AstNode expr = expr(false);
                            int nodeEnd = getNodeEnd(expr);
                            if (mustMatchToken(97, "msg.no.paren", true)) {
                                TokenStream tokenStream = this.ts;
                                int i5 = tokenStream.tokenBeg;
                                nodeEnd = tokenStream.tokenEnd;
                                i = i5;
                            } else {
                                i = -1;
                            }
                            XmlDotQuery xmlDotQuery = new XmlDotQuery(position, nodeEnd - position);
                            xmlDotQuery.setLeft(astNode);
                            xmlDotQuery.setRight(expr);
                            xmlDotQuery.setOperatorPosition(i4);
                            xmlDotQuery.setRp(i - position);
                            xmlDotQuery.setLineColumnNumber(lineNumber, columnNumber);
                            astNode = xmlDotQuery;
                        }
                    }
                    if (peekToken != 186) {
                        z3 = false;
                    }
                    z2 |= z3;
                    astNode = propertyAccess(peekToken, astNode, z2);
                } else if (!z) {
                    break;
                } else {
                    astNode = makeFunctionCall(astNode, position, z2);
                }
            } else {
                consumeToken();
                astNode = makeElemGet(astNode, this.ts.tokenBeg);
            }
        }
        return astNode;
    }

    private ObjectProperty methodDefinition(int i, AstNode astNode, int i2, boolean z) {
        FunctionNode function = function(2, true);
        Name functionName = function.getFunctionName();
        if (functionName != null && functionName.length() != 0) {
            reportError("msg.bad.prop");
        }
        ObjectProperty objectProperty = new ObjectProperty(i);
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 == 8) {
                    objectProperty.setIsNormalMethod();
                    function.setFunctionIsNormalMethod();
                    if (z) {
                        function.setIsES6Generator();
                    }
                }
            } else {
                objectProperty.setIsSetterMethod();
                function.setFunctionIsSetterMethod();
            }
        } else {
            objectProperty.setIsGetterMethod();
            function.setFunctionIsGetterMethod();
        }
        int nodeEnd = getNodeEnd(function);
        objectProperty.setLeft(astNode);
        objectProperty.setRight(function);
        objectProperty.setLength(nodeEnd - i);
        return objectProperty;
    }

    private AstNode mulExpr() {
        AstNode expExpr = expExpr();
        while (true) {
            int peekToken = peekToken();
            int i = this.ts.tokenBeg;
            switch (peekToken) {
                case 23:
                case 24:
                case 25:
                    consumeToken();
                    expExpr = new InfixExpression(peekToken, expExpr, expExpr(), i);
                default:
                    return expExpr;
            }
        }
    }

    private void mustHaveXML() {
        if (!this.compilerEnv.isXmlAvailable()) {
            reportError("msg.XML.not.available");
        }
    }

    private boolean mustMatchToken(int i, String str, boolean z) {
        TokenStream tokenStream = this.ts;
        int i2 = tokenStream.tokenBeg;
        return mustMatchToken(i, str, i2, tokenStream.tokenEnd - i2, z);
    }

    private AstNode name(int i, int i2) {
        String string = this.ts.getString();
        int i3 = this.ts.tokenBeg;
        int lineNumber = lineNumber();
        int columnNumber = columnNumber();
        if ((i & TI_CHECK_LABEL) != 0 && peekToken() == 116) {
            Label label = new Label(i3, this.ts.tokenEnd - i3);
            label.setName(string);
            label.setLineColumnNumber(lineNumber(), columnNumber());
            return label;
        }
        saveNameTokenData(i3, string, lineNumber, columnNumber);
        if (this.compilerEnv.isXmlAvailable()) {
            return propertyName(-1, 0);
        }
        return createNameNode(true, 44);
    }

    private AstNode nameOrLabel() {
        AstNode astNode;
        int nodeEnd;
        List<Comment> list;
        List<Comment> list2;
        if (this.currentToken == 44) {
            int i = this.ts.tokenBeg;
            this.currentFlaggedToken |= TI_CHECK_LABEL;
            AstNode expr = expr(false);
            if (expr.getType() != 144) {
                ExpressionStatement expressionStatement = new ExpressionStatement(expr, !insideFunctionBody());
                expressionStatement.setLineColumnNumber(expr.getLineno(), expr.getColumn());
                return expressionStatement;
            }
            LabeledStatement labeledStatement = new LabeledStatement(i);
            recordLabel((Label) expr, labeledStatement);
            labeledStatement.setLineColumnNumber(expr.getLineno(), expr.getColumn());
            while (true) {
                if (peekToken() == 44) {
                    this.currentFlaggedToken |= TI_CHECK_LABEL;
                    AstNode expr2 = expr(false);
                    if (expr2.getType() != 144) {
                        astNode = new ExpressionStatement(expr2, !insideFunctionBody());
                        autoInsertSemicolon(astNode);
                        break;
                    }
                    recordLabel((Label) expr2, labeledStatement);
                } else {
                    astNode = null;
                    break;
                }
            }
            try {
                this.currentLabel = labeledStatement;
                if (astNode == null) {
                    astNode = statementHelper();
                    if (peekToken() == 175) {
                        if (astNode.getLineno() == this.scannedComments.get(list.size() - 1).getLineno()) {
                            astNode.setInlineComment(this.scannedComments.get(list2.size() - 1));
                            consumeToken();
                        }
                    }
                }
                if (astNode.getParent() == null) {
                    nodeEnd = getNodeEnd(astNode) - i;
                } else {
                    nodeEnd = getNodeEnd(astNode);
                }
                labeledStatement.setLength(nodeEnd);
                labeledStatement.setStatement(astNode);
                return labeledStatement;
            } finally {
                this.currentLabel = null;
                for (Label next : labeledStatement.getLabels()) {
                    this.labelSet.remove(next.getName());
                }
            }
        }
        throw codeBug();
    }

    private int nextToken() {
        int peekToken = peekToken();
        consumeToken();
        return peekToken;
    }

    private static int nodeEnd(AstNode astNode) {
        return astNode.getLength() + astNode.getPosition();
    }

    private static final boolean nowAllSet(int i, int i2, int i3) {
        if ((i & i3) != i3 && (i2 & i3) == i3) {
            return true;
        }
        return false;
    }

    private AstNode nullishCoalescingExpr() {
        AstNode orExpr = orExpr();
        if (matchToken(185, true)) {
            int i = this.ts.tokenBeg;
            AstNode nullishCoalescingExpr = nullishCoalescingExpr();
            if (orExpr.getType() == 117 || orExpr.getType() == 118 || nullishCoalescingExpr.getType() == 117 || nullishCoalescingExpr.getType() == 118) {
                reportError("msg.nullish.bad.token");
            }
            return new InfixExpression(185, orExpr, nullishCoalescingExpr, i);
        }
        return orExpr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x016b, code lost:
        if (r2 != 8) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.ObjectLiteral objectLiteral() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.objectLiteral():org.mozilla.javascript.ast.ObjectLiteral");
    }

    private AstNode objliteralProperty() {
        int peekToken = peekToken();
        if (peekToken != 23) {
            if (peekToken != 89) {
                if (peekToken != 92) {
                    switch (peekToken) {
                        case Token.NAME /* 44 */:
                            return createNameNode();
                        case Token.NUMBER /* 45 */:
                            break;
                        case Token.STRING /* 46 */:
                            return createStringLiteral();
                        default:
                            if (!this.compilerEnv.isReservedKeywordAsIdentifier() || !TokenStream.isKeyword(this.ts.getString(), this.compilerEnv.getLanguageVersion(), this.inUseStrictDirective)) {
                                return null;
                            }
                            return createNameNode();
                    }
                } else if (this.compilerEnv.getLanguageVersion() >= 200) {
                    int i = this.ts.tokenBeg;
                    nextToken();
                    int lineNumber = lineNumber();
                    int columnNumber = columnNumber();
                    AstNode assignExpr = assignExpr();
                    if (peekToken() != 93) {
                        reportError("msg.bad.prop");
                    }
                    nextToken();
                    ComputedPropertyKey computedPropertyKey = new ComputedPropertyKey(i, this.ts.tokenEnd - i);
                    computedPropertyKey.setLineColumnNumber(lineNumber, columnNumber);
                    computedPropertyKey.setExpression(assignExpr);
                    return computedPropertyKey;
                } else {
                    reportError("msg.bad.prop");
                    return null;
                }
            }
            return createNumericLiteral(peekToken, true);
        } else if (this.compilerEnv.getLanguageVersion() >= 200) {
            int i2 = this.ts.tokenBeg;
            nextToken();
            int lineNumber2 = lineNumber();
            int columnNumber2 = columnNumber();
            GeneratorMethodDefinition generatorMethodDefinition = new GeneratorMethodDefinition(i2, this.ts.tokenEnd - i2, objliteralProperty());
            generatorMethodDefinition.setLineColumnNumber(lineNumber2, columnNumber2);
            return generatorMethodDefinition;
        } else {
            reportError("msg.bad.prop");
            return null;
        }
    }

    private AstNode orExpr() {
        AstNode andExpr = andExpr();
        if (matchToken(Token.OR, true)) {
            return new InfixExpression((int) Token.OR, andExpr, orExpr(), this.ts.tokenBeg);
        }
        return andExpr;
    }

    private AstNode parenExpr() {
        AstNode expr;
        boolean z;
        boolean z2 = this.inForInit;
        boolean z3 = false;
        this.inForInit = false;
        try {
            Comment andResetJsDoc = getAndResetJsDoc();
            int lineNumber = lineNumber();
            int columnNumber = columnNumber();
            int i = this.ts.tokenBeg;
            if (peekToken() == 97) {
                expr = new EmptyExpression(i);
            } else {
                expr = expr(true);
            }
            if (peekToken() == 132) {
                AstNode generatorExpression = generatorExpression(expr, i);
                this.inForInit = z2;
                return generatorExpression;
            }
            mustMatchToken(97, "msg.no.paren", true);
            int i2 = this.ts.tokenEnd - i;
            if (expr.getIntProp(29, 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (expr.getIntProp(28, 0) == 1) {
                z3 = true;
            }
            if ((z3 || z || expr.getType() == 141) && peekToken() != 178) {
                reportError("msg.syntax");
                ErrorNode makeErrorNode = makeErrorNode();
                this.inForInit = z2;
                return makeErrorNode;
            }
            ParenthesizedExpression parenthesizedExpression = new ParenthesizedExpression(i, i2, expr);
            parenthesizedExpression.setLineColumnNumber(lineNumber, columnNumber);
            if (andResetJsDoc == null) {
                andResetJsDoc = getAndResetJsDoc();
            }
            if (andResetJsDoc != null) {
                parenthesizedExpression.setJsDocNode(andResetJsDoc);
            }
            if (z3) {
                parenthesizedExpression.putIntProp(28, 1);
            }
            this.inForInit = z2;
            return parenthesizedExpression;
        } catch (Throwable th) {
            this.inForInit = z2;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.AstRoot parse() {
        /*
            r10 = this;
            org.mozilla.javascript.ast.AstRoot r0 = new org.mozilla.javascript.ast.AstRoot
            r1 = 0
            r0.<init>(r1)
            r10.currentScriptOrFn = r0
            r10.currentScope = r0
            org.mozilla.javascript.TokenStream r2 = r10.ts
            int r3 = r2.lineno
            int r2 = r2.getLineno()
            r10.prevNameTokenLineno = r2
            org.mozilla.javascript.TokenStream r2 = r10.ts
            int r2 = r2.getTokenColumn()
            r10.prevNameTokenColumn = r2
            boolean r2 = r10.inUseStrictDirective
            boolean r4 = r10.defaultUseStrictDirective
            r10.inUseStrictDirective = r4
            r5 = 1
            if (r4 == 0) goto L28
            r0.setInStrictMode(r5)
        L28:
            r6 = r1
            r4 = r5
        L2a:
            int r7 = r10.peekToken()     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            if (r7 > 0) goto L31
            goto L47
        L31:
            r8 = 122(0x7a, float:1.71E-43)
            if (r7 != r8) goto L4a
            r10.consumeToken()     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            boolean r7 = r10.calledByCompileFunction     // Catch: java.lang.Throwable -> L44 org.mozilla.javascript.Parser.ParserException -> L47 java.lang.StackOverflowError -> L85
            if (r7 == 0) goto L3e
            r7 = 2
            goto L3f
        L3e:
            r7 = r5
        L3f:
            org.mozilla.javascript.ast.FunctionNode r7 = r10.function(r7)     // Catch: java.lang.Throwable -> L44 org.mozilla.javascript.Parser.ParserException -> L47 java.lang.StackOverflowError -> L85
            goto L7a
        L44:
            r0 = move-exception
            goto Le7
        L47:
            r10.inUseStrictDirective = r2
            goto L94
        L4a:
            r8 = 175(0xaf, float:2.45E-43)
            if (r7 != r8) goto L5f
            java.util.List<org.mozilla.javascript.ast.Comment> r7 = r10.scannedComments     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            int r8 = r8 - r5
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            org.mozilla.javascript.ast.AstNode r7 = (org.mozilla.javascript.ast.AstNode) r7     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            r10.consumeToken()     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            goto L7a
        L5f:
            org.mozilla.javascript.ast.AstNode r7 = r10.statement()     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            if (r4 == 0) goto L7a
            java.lang.String r8 = getDirective(r7)     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            if (r8 != 0) goto L6d
            r4 = r1
            goto L7a
        L6d:
            java.lang.String r9 = "use strict"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            if (r8 == 0) goto L7a
            r10.inUseStrictDirective = r5     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            r0.setInStrictMode(r5)     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
        L7a:
            int r6 = getNodeEnd(r7)     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            r0.addChildToBack(r7)     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            r7.setParent(r0)     // Catch: java.lang.Throwable -> L44 java.lang.StackOverflowError -> L85
            goto L2a
        L85:
            java.lang.String r4 = "msg.too.deep.parser.recursion"
            java.lang.String r4 = r10.lookupMessage(r4)     // Catch: java.lang.Throwable -> L44
            org.mozilla.javascript.CompilerEnvirons r7 = r10.compilerEnv     // Catch: java.lang.Throwable -> L44
            boolean r7 = r7.isIdeMode()     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto Ldb
            goto L47
        L94:
            r10.reportErrorsIfExists(r3)
            java.util.List<org.mozilla.javascript.ast.Comment> r1 = r10.scannedComments
            if (r1 == 0) goto Lc6
            int r1 = r1.size()
            int r1 = r1 - r5
            java.util.List<org.mozilla.javascript.ast.Comment> r2 = r10.scannedComments
            java.lang.Object r1 = r2.get(r1)
            org.mozilla.javascript.ast.AstNode r1 = (org.mozilla.javascript.ast.AstNode) r1
            int r1 = getNodeEnd(r1)
            int r6 = java.lang.Math.max(r6, r1)
            java.util.List<org.mozilla.javascript.ast.Comment> r1 = r10.scannedComments
            java.util.Iterator r1 = r1.iterator()
        Lb6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc6
            java.lang.Object r2 = r1.next()
            org.mozilla.javascript.ast.Comment r2 = (org.mozilla.javascript.ast.Comment) r2
            r0.addComment(r2)
            goto Lb6
        Lc6:
            r0.setLength(r6)
            java.lang.String r1 = r10.sourceURI
            r0.setSourceName(r1)
            r0.setBaseLineno(r3)
            org.mozilla.javascript.TokenStream r10 = r10.ts
            int r10 = r10.getLineno()
            r0.setEndLineno(r10)
            return r0
        Ldb:
            java.lang.String r0 = r10.sourceURI     // Catch: java.lang.Throwable -> L44
            int r3 = r10.lineNumber()     // Catch: java.lang.Throwable -> L44
            r5 = 0
            org.mozilla.javascript.EvaluatorException r0 = org.mozilla.javascript.Context.reportRuntimeError(r4, r0, r3, r5, r1)     // Catch: java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Throwable -> L44
        Le7:
            r10.inUseStrictDirective = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.parse():org.mozilla.javascript.ast.AstRoot");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:7|(1:9)(1:65)|10|11|(3:13|(1:15)|16)(5:21|(2:22|(1:1)(3:26|(2:28|(2:30|(1:48)(2:32|(2:34|35)(2:37|(1:47)(4:39|(1:41)|42|(2:44|45)(1:46)))))(2:49|50))(2:51|52)|36))|54|(1:56)|57)|17|18|19)(1:6))|66|(0)(0)|10|11|(0)(0)|17|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
        r8.nestingOfFunction--;
        r8.inUseStrictDirective = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x0072, ParserException -> 0x00f3, TRY_ENTER, TryCatch #2 {ParserException -> 0x00f3, all -> 0x0072, blocks: (B:15:0x0044, B:17:0x006c, B:20:0x0075, B:22:0x0082, B:30:0x0097, B:32:0x009d, B:35:0x00a5, B:37:0x00ad, B:39:0x00b3, B:40:0x00b8, B:42:0x00bf, B:45:0x00db, B:43:0x00c3, B:44:0x00d4, B:46:0x00df, B:48:0x00eb, B:49:0x00ef), top: B:56:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.AstNode parseFunctionBody(int r9, org.mozilla.javascript.ast.FunctionNode r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.parseFunctionBody(int, org.mozilla.javascript.ast.FunctionNode):org.mozilla.javascript.ast.AstNode");
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0169 A[EDGE_INSN: B:93:0x0169->B:75:0x0169 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseFunctionParams(org.mozilla.javascript.ast.FunctionNode r15) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.parseFunctionParams(org.mozilla.javascript.ast.FunctionNode):void");
    }

    private int peekFlaggedToken() {
        peekToken();
        return this.currentFlaggedToken;
    }

    private int peekToken() {
        if (this.currentFlaggedToken != 0) {
            return this.currentToken;
        }
        int token = this.ts.getToken();
        int i = 0;
        boolean z = false;
        while (true) {
            if (token != 1 && token != 175) {
                break;
            } else if (token == 1) {
                token = this.ts.getToken();
                z = true;
            } else {
                boolean isRecordingComments = this.compilerEnv.isRecordingComments();
                TokenStream tokenStream = this.ts;
                if (isRecordingComments) {
                    recordComment(this.ts.getTokenStartLineno(), this.ts.getTokenColumn(), tokenStream.getAndResetCurrentComment());
                    break;
                }
                token = tokenStream.getToken();
            }
        }
        this.currentToken = token;
        if (z) {
            i = 65536;
        }
        this.currentFlaggedToken = i | token;
        return token;
    }

    private int peekTokenOrEOL() {
        int peekToken = peekToken();
        if ((this.currentFlaggedToken & 65536) != 0) {
            return 1;
        }
        return peekToken;
    }

    private int peekUntilNonComment(int i) {
        while (i == 175) {
            consumeToken();
            i = peekToken();
        }
        return i;
    }

    private ObjectProperty plainProperty(AstNode astNode, int i) {
        int peekToken = peekToken();
        if ((peekToken == 98 || peekToken == 95) && i == 44 && this.compilerEnv.getLanguageVersion() >= 180) {
            if (!this.inDestructuringAssignment && this.compilerEnv.getLanguageVersion() < 200) {
                reportError("msg.bad.object.init");
            }
            Name name = new Name(astNode.getPosition(), astNode.getString());
            ObjectProperty objectProperty = new ObjectProperty();
            objectProperty.setIsShorthand(true);
            objectProperty.setLeftAndRight(astNode, name);
            return objectProperty;
        } else if (peekToken == 99) {
            ObjectProperty objectProperty2 = new ObjectProperty();
            consumeToken();
            Assignment assignment = new Assignment(astNode, assignExpr());
            assignment.setType(99);
            objectProperty2.setLeftAndRight(astNode, assignment);
            return objectProperty2;
        } else {
            mustMatchToken(Token.COLON, "msg.no.colon.prop", true);
            ObjectProperty objectProperty3 = new ObjectProperty();
            objectProperty3.setOperatorPosition(this.ts.tokenBeg);
            objectProperty3.setLeftAndRight(astNode, assignExpr());
            return objectProperty3;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private org.mozilla.javascript.ast.AstNode primaryExpr() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.primaryExpr():org.mozilla.javascript.ast.AstNode");
    }

    private void processDestructuringDefaults(int i, Node node, List<String> list, Assignment assignment, Node node2, int i2, Transformer transformer) {
        AstNode left = assignment.getLeft();
        if (left.getType() == 44) {
            String string = left.getString();
            AstNode right = assignment.getRight();
            Node node3 = right;
            if (transformer != null) {
                node3 = transformer.transform(right);
            }
            Node node4 = new Node((int) Token.HOOK, new Node(51, createName("undefined"), node2), node3, node2);
            Node node5 = new Node((int) Token.HOOK, new Node(51, createName("undefined"), createName(string)), node4, left);
            if (transformer == null) {
                this.currentScriptOrFn.putDestructuringRvalues(node4, node3);
            }
            node.addChildToBack(new Node(i2, createName(54, string, null), node5));
            if (i != -1) {
                defineSymbol(i, string, true);
                list.add(string);
            }
        }
    }

    private AstNode propertyAccess(int i, AstNode astNode, boolean z) {
        int i2;
        AstNode propertyName;
        InfixExpression propertyGet;
        String keywordToName;
        if (astNode == null) {
            codeBug();
        }
        if (astNode.getType() == 79 && z) {
            reportError("msg.optional.super");
            return makeErrorNode();
        }
        int lineNumber = lineNumber();
        int i3 = this.ts.tokenBeg;
        int columnNumber = columnNumber();
        consumeToken();
        if (i == 157) {
            mustHaveXML();
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (!this.compilerEnv.isXmlAvailable()) {
            if (nextToken() != 44 && (!this.compilerEnv.isReservedKeywordAsIdentifier() || !TokenStream.isKeyword(this.ts.getString(), this.compilerEnv.getLanguageVersion(), this.inUseStrictDirective))) {
                reportError("msg.no.name.after.dot");
            }
            PropertyGet propertyGet2 = new PropertyGet(astNode, createNameNode(true, 33), i3);
            propertyGet2.setLineColumnNumber(lineNumber, columnNumber);
            return propertyGet2;
        }
        int nextToken = nextToken();
        if (nextToken != 23) {
            if (nextToken != 44) {
                if (nextToken != 55) {
                    if (nextToken != 92) {
                        if (nextToken != 96) {
                            if (nextToken != 140) {
                                if (nextToken != 161) {
                                    if (this.compilerEnv.isReservedKeywordAsIdentifier() && (keywordToName = Token.keywordToName(nextToken)) != null) {
                                        saveNameTokenData(this.ts.tokenBeg, keywordToName, lineNumber(), columnNumber());
                                        propertyName = propertyName(-1, i2);
                                    } else {
                                        reportError("msg.no.name.after.dot");
                                        return makeErrorNode();
                                    }
                                } else {
                                    propertyName = attributeAccess();
                                }
                            } else {
                                saveNameTokenData(this.ts.tokenBeg, this.ts.getString(), lineNumber(), columnNumber());
                                propertyName = propertyName(-1, i2);
                            }
                        } else if (i == 186) {
                            return makeFunctionCall(astNode, astNode.getPosition(), z);
                        } else {
                            reportError("msg.no.name.after.dot");
                            return makeErrorNode();
                        }
                    } else if (i == 186) {
                        consumeToken();
                        ElementGet makeElemGet = makeElemGet(astNode, this.ts.tokenBeg);
                        makeElemGet.setType(Token.QUESTION_DOT);
                        return makeElemGet;
                    } else {
                        reportError("msg.no.name.after.dot");
                        return makeErrorNode();
                    }
                } else {
                    saveNameTokenData(this.ts.tokenBeg, "throw", lineNumber(), columnNumber());
                    propertyName = propertyName(-1, i2);
                }
            } else {
                propertyName = propertyName(-1, i2);
            }
        } else {
            saveNameTokenData(this.ts.tokenBeg, "*", lineNumber(), columnNumber());
            propertyName = propertyName(-1, i2);
        }
        boolean z2 = propertyName instanceof XmlRef;
        if (z2) {
            propertyGet = new XmlMemberGet();
        } else {
            propertyGet = new PropertyGet();
        }
        if (z2 && i == 121) {
            propertyGet.setType(Token.DOT);
        }
        if (z) {
            propertyGet.setType(Token.QUESTION_DOT);
        }
        int position = astNode.getPosition();
        propertyGet.setPosition(position);
        propertyGet.setLength(getNodeEnd(propertyName) - position);
        propertyGet.setOperatorPosition(i3 - position);
        propertyGet.setLineColumnNumber(lineNumber, columnNumber);
        propertyGet.setLeft(astNode);
        propertyGet.setRight(propertyName);
        return propertyGet;
    }

    private AstNode propertyName(int i, int i2) {
        int i3;
        Name name;
        int i4;
        if (i != -1) {
            i3 = i;
        } else {
            i3 = this.ts.tokenBeg;
        }
        int lineNumber = lineNumber();
        int columnNumber = columnNumber();
        Name createNameNode = createNameNode(true, this.currentToken);
        if (matchToken(Token.COLONCOLON, true)) {
            i4 = this.ts.tokenBeg;
            int nextToken = nextToken();
            if (nextToken != 23) {
                if (nextToken != 44) {
                    if (nextToken != 92) {
                        reportError("msg.no.name.after.coloncolon");
                        return makeErrorNode();
                    }
                    return xmlElemRef(i, createNameNode, i4);
                }
                name = createNameNode();
            } else {
                saveNameTokenData(this.ts.tokenBeg, "*", lineNumber(), columnNumber());
                name = createNameNode(false, -1);
            }
        } else {
            createNameNode = null;
            name = createNameNode;
            i4 = -1;
        }
        if (createNameNode == null && i2 == 0 && i == -1) {
            return name;
        }
        XmlPropRef xmlPropRef = new XmlPropRef(i3, getNodeEnd(name) - i3);
        xmlPropRef.setAtPos(i);
        xmlPropRef.setNamespace(createNameNode);
        xmlPropRef.setColonPos(i4);
        xmlPropRef.setPropName(name);
        xmlPropRef.setLineColumnNumber(lineNumber, columnNumber);
        return xmlPropRef;
    }

    private void recordComment(int i, int i2, String str) {
        if (this.scannedComments == null) {
            this.scannedComments = new ArrayList();
        }
        TokenStream tokenStream = this.ts;
        Comment comment = new Comment(tokenStream.tokenBeg, tokenStream.getTokenLength(), this.ts.commentType, str);
        if (this.ts.commentType == Token.CommentType.JSDOC && this.compilerEnv.isRecordingLocalJsDocComments()) {
            TokenStream tokenStream2 = this.ts;
            Comment comment2 = new Comment(tokenStream2.tokenBeg, tokenStream2.getTokenLength(), this.ts.commentType, str);
            this.currentJsDocComment = comment2;
            comment2.setLineColumnNumber(i, i2);
        }
        comment.setLineColumnNumber(i, i2);
        this.scannedComments.add(comment);
    }

    private void recordLabel(Label label, LabeledStatement labeledStatement) {
        if (peekToken() != 116) {
            codeBug();
        }
        consumeToken();
        String name = label.getName();
        Map<String, LabeledStatement> map = this.labelSet;
        if (map == null) {
            this.labelSet = new HashMap();
        } else {
            LabeledStatement labeledStatement2 = map.get(name);
            if (labeledStatement2 != null) {
                if (this.compilerEnv.isIdeMode()) {
                    Label labelByName = labeledStatement2.getLabelByName(name);
                    reportError("msg.dup.label", labelByName.getAbsolutePosition(), labelByName.getLength());
                }
                reportError("msg.dup.label", label.getPosition(), label.getLength());
            }
        }
        labeledStatement.addLabel(label);
        this.labelSet.put(name, labeledStatement);
    }

    private AstNode relExpr() {
        AstNode shiftExpr = shiftExpr();
        while (true) {
            int peekToken = peekToken();
            int i = this.ts.tokenBeg;
            if (peekToken != 57) {
                if (peekToken != 58) {
                    switch (peekToken) {
                    }
                } else {
                    continue;
                }
                consumeToken();
                shiftExpr = new InfixExpression(peekToken, shiftExpr, shiftExpr(), i);
            } else if (!this.inForInit) {
                consumeToken();
                shiftExpr = new InfixExpression(peekToken, shiftExpr, shiftExpr(), i);
            }
        }
        return shiftExpr;
    }

    private void restoreRelativeLoopPosition(Loop loop) {
        if (loop.getParent() != null) {
            loop.setRelative(loop.getParent().getPosition());
        }
    }

    private AstNode returnOrYield(int i, boolean z) {
        boolean z2;
        int i2;
        AstNode astNode;
        AstNode yield;
        String str;
        int i3 = 4;
        if (!insideFunctionBody()) {
            if (i != 4) {
                str = "msg.bad.yield";
            } else {
                str = "msg.bad.return";
            }
            reportError(str);
        }
        consumeToken();
        int lineNumber = lineNumber();
        int columnNumber = columnNumber();
        TokenStream tokenStream = this.ts;
        int i4 = tokenStream.tokenBeg;
        int i5 = tokenStream.tokenEnd;
        if (i == 78 && this.compilerEnv.getLanguageVersion() >= 200 && peekToken() == 23) {
            consumeToken();
            z2 = true;
        } else {
            z2 = false;
        }
        int peekTokenOrEOL = peekTokenOrEOL();
        if (peekTokenOrEOL != -1 && peekTokenOrEOL != 0 && peekTokenOrEOL != 1 && (peekTokenOrEOL == 78 ? this.compilerEnv.getLanguageVersion() >= 200 : peekTokenOrEOL != 91 && peekTokenOrEOL != 93 && peekTokenOrEOL != 95 && peekTokenOrEOL != 97)) {
            astNode = expr(false);
            i2 = getNodeEnd(astNode);
        } else {
            i2 = i5;
            astNode = null;
        }
        int i6 = this.endFlags;
        if (i == 4) {
            if (astNode == null) {
                i3 = 2;
            }
            this.endFlags = i6 | i3;
            int i7 = i2 - i4;
            yield = new ReturnStatement(i4, i7, astNode);
            if (nowAllSet(i6, this.endFlags, 6)) {
                addStrictWarning("msg.return.inconsistent", "", i4, i7);
            }
        } else {
            if (!insideFunctionBody()) {
                reportError("msg.bad.yield");
            }
            this.endFlags |= 8;
            yield = new Yield(i4, i2 - i4, astNode, z2);
            setRequiresActivation();
            setIsGenerator();
            if (!z) {
                yield.setLineColumnNumber(lineNumber, columnNumber);
                yield = new ExpressionStatement(yield);
            }
        }
        if (insideFunctionBody() && nowAllSet(i6, this.endFlags, 12) && !((FunctionNode) this.currentScriptOrFn).isES6Generator()) {
            Name functionName = ((FunctionNode) this.currentScriptOrFn).getFunctionName();
            if (functionName != null && functionName.length() != 0) {
                addError("msg.generator.returns", functionName.getIdentifier());
            } else {
                addError("msg.anon.generator.returns", "");
            }
        }
        yield.setLineColumnNumber(lineNumber, columnNumber);
        return yield;
    }

    private void saveNameTokenData(int i, String str, int i2, int i3) {
        this.prevNameTokenStart = i;
        this.prevNameTokenString = str;
        this.prevNameTokenLineno = i2;
        this.prevNameTokenColumn = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setupDefaultValues(java.lang.String r6, org.mozilla.javascript.Node r7, org.mozilla.javascript.ast.AstNode r8, int r9, org.mozilla.javascript.Parser.Transformer r10) {
        /*
            r5 = this;
            if (r8 == 0) goto L3a
            if (r10 == 0) goto L8
            org.mozilla.javascript.Node r8 = r10.transform(r8)
        L8:
            org.mozilla.javascript.Node r0 = new org.mozilla.javascript.Node
            org.mozilla.javascript.Node r1 = new org.mozilla.javascript.Node
            org.mozilla.javascript.Node r2 = r5.createName(r6)
            java.lang.String r3 = "undefined"
            org.mozilla.javascript.Node r3 = r5.createName(r3)
            r4 = 51
            r1.<init>(r4, r2, r3)
            org.mozilla.javascript.Node r2 = r5.createName(r6)
            r3 = 115(0x73, float:1.61E-43)
            r0.<init>(r3, r1, r8, r2)
            if (r10 != 0) goto L2b
            org.mozilla.javascript.ast.ScriptNode r10 = r5.currentScriptOrFn
            r10.putDestructuringRvalues(r0, r8)
        L2b:
            org.mozilla.javascript.Node r8 = new org.mozilla.javascript.Node
            r10 = 54
            r1 = 0
            org.mozilla.javascript.Node r5 = r5.createName(r10, r6, r1)
            r8.<init>(r9, r5, r0)
            r7.addChildToBack(r8)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.setupDefaultValues(java.lang.String, org.mozilla.javascript.Node, org.mozilla.javascript.ast.AstNode, int, org.mozilla.javascript.Parser$Transformer):void");
    }

    private AstNode shiftExpr() {
        AstNode addExpr = addExpr();
        while (true) {
            int peekToken = peekToken();
            int i = this.ts.tokenBeg;
            switch (peekToken) {
                case 18:
                case 19:
                case 20:
                    consumeToken();
                    addExpr = new InfixExpression(peekToken, addExpr, addExpr(), i);
                default:
                    return addExpr;
            }
        }
    }

    private AstNode statement() {
        int peekTokenOrEOL;
        String str;
        int i = this.ts.tokenBeg;
        try {
            AstNode statementHelper = statementHelper();
            if (statementHelper != null) {
                if (this.compilerEnv.isStrictMode() && !statementHelper.hasSideEffects()) {
                    int position = statementHelper.getPosition();
                    int max = Math.max(position, lineBeginningFor(position));
                    if (statementHelper instanceof EmptyStatement) {
                        str = "msg.extra.trailing.semi";
                    } else {
                        str = "msg.no.side.effects";
                    }
                    addStrictWarning(str, "", max, nodeEnd(statementHelper) - max);
                }
                if (peekToken() == 175) {
                    int lineno = statementHelper.getLineno();
                    List<Comment> list = this.scannedComments;
                    if (lineno == list.get(list.size() - 1).getLineno()) {
                        List<Comment> list2 = this.scannedComments;
                        statementHelper.setInlineComment(list2.get(list2.size() - 1));
                        consumeToken();
                    }
                }
                return statementHelper;
            }
        } catch (ParserException unused) {
        }
        do {
            peekTokenOrEOL = peekTokenOrEOL();
            consumeToken();
            if (peekTokenOrEOL == -1 || peekTokenOrEOL == 0 || peekTokenOrEOL == 1) {
                break;
            }
        } while (peekTokenOrEOL != 91);
        return new EmptyStatement(i, this.ts.tokenBeg - i);
    }

    private AstNode statementHelper() {
        AstNode returnOrYield;
        LabeledStatement labeledStatement = this.currentLabel;
        if (labeledStatement != null && labeledStatement.getStatement() != null) {
            this.currentLabel = null;
        }
        int peekToken = peekToken();
        TokenStream tokenStream = this.ts;
        int i = tokenStream.tokenBeg;
        if (peekToken != -1) {
            if (peekToken != 4) {
                if (peekToken != 44) {
                    if (peekToken != 55) {
                        if (peekToken != 78) {
                            if (peekToken != 94) {
                                if (peekToken != 122) {
                                    if (peekToken != 125) {
                                        if (peekToken != 127) {
                                            if (peekToken != 90) {
                                                if (peekToken != 91) {
                                                    if (peekToken != 167) {
                                                        if (peekToken != 168) {
                                                            if (peekToken != 174) {
                                                                if (peekToken != 175) {
                                                                    switch (peekToken) {
                                                                        case Token.DEFAULT /* 129 */:
                                                                            returnOrYield = defaultXmlNamespace();
                                                                            break;
                                                                        case 130:
                                                                            return whileLoop();
                                                                        case Token.DO /* 131 */:
                                                                            return doLoop();
                                                                        case Token.FOR /* 132 */:
                                                                            return forLoop();
                                                                        case Token.BREAK /* 133 */:
                                                                            returnOrYield = breakStatement();
                                                                            break;
                                                                        case Token.CONTINUE /* 134 */:
                                                                            returnOrYield = continueStatement();
                                                                            break;
                                                                        case Token.VAR /* 135 */:
                                                                            break;
                                                                        case Token.WITH /* 136 */:
                                                                            if (this.inUseStrictDirective) {
                                                                                reportError("msg.no.with.strict");
                                                                            }
                                                                            return withStatement();
                                                                        default:
                                                                            int lineno = tokenStream.getLineno();
                                                                            int tokenColumn = this.ts.getTokenColumn();
                                                                            returnOrYield = new ExpressionStatement(expr(false), true ^ insideFunctionBody());
                                                                            returnOrYield.setLineColumnNumber(lineno, tokenColumn);
                                                                            break;
                                                                    }
                                                                } else {
                                                                    List<Comment> list = this.scannedComments;
                                                                    return list.get(list.size() - 1);
                                                                }
                                                            } else {
                                                                consumeToken();
                                                                TokenStream tokenStream2 = this.ts;
                                                                int i2 = tokenStream2.tokenBeg;
                                                                returnOrYield = new KeywordLiteral(i2, tokenStream2.tokenEnd - i2, peekToken);
                                                                returnOrYield.setLineColumnNumber(lineNumber(), columnNumber());
                                                            }
                                                        }
                                                        consumeToken();
                                                        int lineNumber = lineNumber();
                                                        int columnNumber = columnNumber();
                                                        returnOrYield = variables(this.currentToken, this.ts.tokenBeg, true);
                                                        returnOrYield.setLineColumnNumber(lineNumber, columnNumber);
                                                    } else {
                                                        AstNode letStatement = letStatement();
                                                        if ((letStatement instanceof VariableDeclaration) && peekToken() == 91) {
                                                            returnOrYield = letStatement;
                                                        } else {
                                                            return letStatement;
                                                        }
                                                    }
                                                } else {
                                                    consumeToken();
                                                    int i3 = this.ts.tokenBeg;
                                                    EmptyStatement emptyStatement = new EmptyStatement(i3, this.ts.tokenEnd - i3);
                                                    emptyStatement.setLineColumnNumber(lineNumber(), columnNumber());
                                                    return emptyStatement;
                                                }
                                            } else {
                                                return tryStatement();
                                            }
                                        } else {
                                            return switchStatement();
                                        }
                                    } else {
                                        return ifStatement();
                                    }
                                } else {
                                    consumeToken();
                                    return function(3);
                                }
                            } else {
                                return block();
                            }
                        }
                    } else {
                        returnOrYield = throwStatement();
                    }
                } else {
                    returnOrYield = nameOrLabel();
                    if (!(returnOrYield instanceof ExpressionStatement)) {
                        return returnOrYield;
                    }
                }
                autoInsertSemicolon(returnOrYield);
                return returnOrYield;
            }
            returnOrYield = returnOrYield(peekToken, false);
            autoInsertSemicolon(returnOrYield);
            return returnOrYield;
        }
        consumeToken();
        return makeErrorNode();
    }

    private AstNode statements(AstNode astNode) {
        if (this.currentToken != 94 && !this.compilerEnv.isIdeMode()) {
            codeBug();
        }
        int i = this.ts.tokenBeg;
        if (astNode == null) {
            astNode = new Block(i);
        }
        astNode.setLineColumnNumber(lineNumber(), columnNumber());
        while (true) {
            int peekToken = peekToken();
            if (peekToken <= 0 || peekToken == 95) {
                break;
            }
            astNode.addChild(statement());
        }
        astNode.setLength(this.ts.tokenBeg - i);
        return astNode;
    }

    private SwitchStatement switchStatement() {
        boolean z;
        AstNode astNode;
        if (this.currentToken != 127) {
            codeBug();
        }
        consumeToken();
        int i = this.ts.tokenBeg;
        SwitchStatement switchStatement = new SwitchStatement(i);
        switchStatement.setLineColumnNumber(lineNumber(), columnNumber());
        if (mustMatchToken(96, "msg.no.paren.switch", true)) {
            switchStatement.setLp(this.ts.tokenBeg - i);
        }
        switchStatement.setExpression(expr(false));
        enterSwitch(switchStatement);
        try {
            if (mustMatchToken(97, "msg.no.paren.after.switch", true)) {
                switchStatement.setRp(this.ts.tokenBeg - i);
            }
            mustMatchToken(94, "msg.no.brace.switch", true);
            boolean z2 = false;
            while (true) {
                int nextToken = nextToken();
                int i2 = this.ts.tokenBeg;
                int lineNumber = lineNumber();
                int columnNumber = columnNumber();
                if (nextToken != 95) {
                    if (nextToken != 175) {
                        if (nextToken != 128) {
                            if (nextToken != 129) {
                                reportError("msg.bad.switch");
                                break;
                            }
                            if (z2) {
                                reportError("msg.double.switch.default");
                            }
                            mustMatchToken(Token.COLON, "msg.no.colon.case", true);
                            astNode = null;
                            z = true;
                        } else {
                            AstNode expr = expr(false);
                            mustMatchToken(Token.COLON, "msg.no.colon.case", true);
                            z = z2;
                            astNode = expr;
                        }
                        SwitchCase switchCase = new SwitchCase(i2);
                        switchCase.setExpression(astNode);
                        switchCase.setLength(this.ts.tokenEnd - i);
                        switchCase.setLineColumnNumber(lineNumber, columnNumber);
                        while (true) {
                            int peekToken = peekToken();
                            if (peekToken == 95 || peekToken == 128 || peekToken == 129 || peekToken == 0) {
                                break;
                            } else if (peekToken == 175) {
                                List<Comment> list = this.scannedComments;
                                Comment comment = list.get(list.size() - 1);
                                if (switchCase.getInlineComment() == null && comment.getLineno() == switchCase.getLineno()) {
                                    switchCase.setInlineComment(comment);
                                } else {
                                    switchCase.addStatement(comment);
                                }
                                consumeToken();
                            } else {
                                switchCase.addStatement(statement());
                            }
                        }
                        switchStatement.addCase(switchCase);
                        z2 = z;
                    } else {
                        List<Comment> list2 = this.scannedComments;
                        switchStatement.addChild(list2.get(list2.size() - 1));
                    }
                } else {
                    switchStatement.setLength(this.ts.tokenEnd - i);
                    break;
                }
            }
            exitSwitch();
            return switchStatement;
        } catch (Throwable th) {
            exitSwitch();
            throw th;
        }
    }

    private AstNode taggedTemplateLiteral(AstNode astNode) {
        AstNode templateLiteral = templateLiteral(true);
        TaggedTemplateLiteral taggedTemplateLiteral = new TaggedTemplateLiteral();
        taggedTemplateLiteral.setTarget(astNode);
        taggedTemplateLiteral.setTemplateLiteral(templateLiteral);
        taggedTemplateLiteral.setLineColumnNumber(astNode.getLineno(), astNode.getColumn());
        return taggedTemplateLiteral;
    }

    private AstNode templateLiteral(boolean z) {
        if (this.currentToken != 180) {
            codeBug();
        }
        TokenStream tokenStream = this.ts;
        int i = tokenStream.tokenBeg;
        int i2 = tokenStream.tokenEnd;
        int lineNumber = lineNumber();
        int columnNumber = columnNumber();
        ArrayList arrayList = new ArrayList();
        TemplateLiteral templateLiteral = new TemplateLiteral(i);
        TokenStream tokenStream2 = this.ts;
        int i3 = tokenStream2.tokenBeg + 1;
        int readTemplateLiteral = tokenStream2.readTemplateLiteral(z);
        while (readTemplateLiteral == 182) {
            arrayList.add(createTemplateLiteralCharacters(i3));
            arrayList.add(expr(false));
            mustMatchToken(95, "msg.syntax", true);
            TokenStream tokenStream3 = this.ts;
            i3 = tokenStream3.tokenBeg + 1;
            readTemplateLiteral = tokenStream3.readTemplateLiteral(z);
        }
        if (readTemplateLiteral == -1) {
            return makeErrorNode();
        }
        arrayList.add(createTemplateLiteralCharacters(i3));
        int i4 = this.ts.tokenEnd;
        templateLiteral.setElements(arrayList);
        templateLiteral.setLength(i4 - i);
        templateLiteral.setLineColumnNumber(lineNumber, columnNumber);
        return templateLiteral;
    }

    private ThrowStatement throwStatement() {
        if (this.currentToken != 55) {
            codeBug();
        }
        consumeToken();
        int i = this.ts.tokenBeg;
        int lineNumber = lineNumber();
        int columnNumber = columnNumber();
        if (peekTokenOrEOL() == 1) {
            reportError("msg.bad.throw.eol");
        }
        ThrowStatement throwStatement = new ThrowStatement(i, expr(false));
        throwStatement.setLineColumnNumber(lineNumber, columnNumber);
        return throwStatement;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.TryStatement tryStatement() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.tryStatement():org.mozilla.javascript.ast.TryStatement");
    }

    private AstNode unaryExpr() {
        int peekToken = peekToken();
        if (peekToken == 175) {
            consumeToken();
            peekToken = peekUntilNonComment(peekToken);
        }
        if (peekToken != -1) {
            if (peekToken != 14) {
                if (peekToken != 139) {
                    if (peekToken != 21) {
                        if (peekToken != 22) {
                            if (peekToken != 26 && peekToken != 27) {
                                if (peekToken != 31) {
                                    if (peekToken != 32) {
                                        if (peekToken == 119 || peekToken == 120) {
                                            consumeToken();
                                            int lineNumber = lineNumber();
                                            int columnNumber = columnNumber();
                                            UpdateExpression updateExpression = new UpdateExpression(peekToken, this.ts.tokenBeg, memberExpr(true));
                                            updateExpression.setLineColumnNumber(lineNumber, columnNumber);
                                            checkBadIncDec(updateExpression);
                                            return updateExpression;
                                        }
                                    }
                                } else {
                                    consumeToken();
                                    int lineNumber2 = lineNumber();
                                    int columnNumber2 = columnNumber();
                                    UnaryExpression unaryExpression = new UnaryExpression(peekToken, this.ts.tokenBeg, unaryExpr());
                                    unaryExpression.setLineColumnNumber(lineNumber2, columnNumber2);
                                    return unaryExpression;
                                }
                            }
                        } else {
                            consumeToken();
                            int lineNumber3 = lineNumber();
                            int columnNumber3 = columnNumber();
                            UnaryExpression unaryExpression2 = new UnaryExpression(29, this.ts.tokenBeg, unaryExpr());
                            unaryExpression2.setLineColumnNumber(lineNumber3, columnNumber3);
                            return unaryExpression2;
                        }
                    } else {
                        consumeToken();
                        int lineNumber4 = lineNumber();
                        int columnNumber4 = columnNumber();
                        UnaryExpression unaryExpression3 = new UnaryExpression(28, this.ts.tokenBeg, unaryExpr());
                        unaryExpression3.setLineColumnNumber(lineNumber4, columnNumber4);
                        return unaryExpression3;
                    }
                }
                consumeToken();
                int lineNumber5 = lineNumber();
                int columnNumber5 = columnNumber();
                UnaryExpression unaryExpression4 = new UnaryExpression(peekToken, this.ts.tokenBeg, unaryExpr());
                unaryExpression4.setLineColumnNumber(lineNumber5, columnNumber5);
                return unaryExpression4;
            } else if (this.compilerEnv.isXmlAvailable()) {
                consumeToken();
                return memberExprTail(true, xmlInitializer());
            }
            AstNode memberExpr = memberExpr(true);
            int peekTokenOrEOL = peekTokenOrEOL();
            if (peekTokenOrEOL != 119 && peekTokenOrEOL != 120) {
                return memberExpr;
            }
            consumeToken();
            UpdateExpression updateExpression2 = new UpdateExpression(peekTokenOrEOL, this.ts.tokenBeg, memberExpr, true);
            updateExpression2.setLineColumnNumber(memberExpr.getLineno(), memberExpr.getColumn());
            checkBadIncDec(updateExpression2);
            return updateExpression2;
        }
        consumeToken();
        return makeErrorNode();
    }

    private VariableDeclaration variables(int i, int i2, boolean z) {
        AstNode destructuringPrimaryExpr;
        int i3;
        Name name;
        VariableDeclaration variableDeclaration = new VariableDeclaration(i2);
        variableDeclaration.setType(i);
        variableDeclaration.setLineColumnNumber(lineNumber(), columnNumber());
        Comment andResetJsDoc = getAndResetJsDoc();
        if (andResetJsDoc != null) {
            variableDeclaration.setJsDocNode(andResetJsDoc);
        }
        do {
            int peekToken = peekToken();
            TokenStream tokenStream = this.ts;
            int i4 = tokenStream.tokenBeg;
            int i5 = tokenStream.tokenEnd;
            AstNode astNode = null;
            if (peekToken != 92 && peekToken != 94) {
                mustMatchToken(44, "msg.bad.var", true);
                Name createNameNode = createNameNode();
                createNameNode.setLineColumnNumber(lineNumber(), columnNumber());
                if (this.inUseStrictDirective) {
                    String string = this.ts.getString();
                    if ("eval".equals(string) || "arguments".equals(this.ts.getString())) {
                        reportError("msg.bad.id.strict", string);
                    }
                }
                defineSymbol(i, this.ts.getString(), this.inForInit);
                i3 = i5;
                name = createNameNode;
                destructuringPrimaryExpr = null;
            } else {
                destructuringPrimaryExpr = destructuringPrimaryExpr();
                int nodeEnd = getNodeEnd(destructuringPrimaryExpr);
                if (!(destructuringPrimaryExpr instanceof DestructuringForm)) {
                    reportError("msg.bad.assign.left", i4, nodeEnd - i4);
                }
                markDestructuring(destructuringPrimaryExpr);
                i3 = nodeEnd;
                name = null;
            }
            int lineNumber = lineNumber();
            int columnNumber = columnNumber();
            Comment andResetJsDoc2 = getAndResetJsDoc();
            if (matchToken(99, true)) {
                astNode = assignExpr();
                i3 = getNodeEnd(astNode);
            }
            VariableInitializer variableInitializer = new VariableInitializer(i4, i3 - i4);
            if (destructuringPrimaryExpr != null) {
                if (astNode == null && !this.inForInit) {
                    reportError("msg.destruct.assign.no.init");
                }
                variableInitializer.setTarget(destructuringPrimaryExpr);
            } else {
                variableInitializer.setTarget(name);
            }
            variableInitializer.setInitializer(astNode);
            variableInitializer.setType(i);
            variableInitializer.setJsDocNode(andResetJsDoc2);
            variableInitializer.setLineColumnNumber(lineNumber, columnNumber);
            variableDeclaration.addVariable(variableInitializer);
        } while (matchToken(98, true));
        variableDeclaration.setLength(i3 - i2);
        variableDeclaration.setIsStatement(z);
        return variableDeclaration;
    }

    private void warnMissingSemi(int i, int i2) {
        if (this.compilerEnv.isStrictMode()) {
            int[] iArr = new int[2];
            String line = this.ts.getLine(i2, iArr);
            if (this.compilerEnv.isIdeMode()) {
                i = Math.max(i, i2 - iArr[1]);
            }
            int i3 = i;
            if (line != null) {
                addStrictWarning("msg.missing.semi", "", i3, i2 - i3, iArr[0], line, iArr[1]);
            } else {
                addStrictWarning("msg.missing.semi", "", i3, i2 - i3);
            }
        }
    }

    private void warnTrailingComma(int i, List<?> list, int i2) {
        if (this.compilerEnv.getWarnTrailingComma()) {
            if (!list.isEmpty()) {
                i = ((AstNode) list.get(0)).getPosition();
            }
            int max = Math.max(i, lineBeginningFor(i2));
            addWarning("msg.extra.trailing.comma", max, i2 - max);
        }
    }

    private WhileLoop whileLoop() {
        if (this.currentToken != 130) {
            codeBug();
        }
        consumeToken();
        int i = this.ts.tokenBeg;
        WhileLoop whileLoop = new WhileLoop(i);
        whileLoop.setLineColumnNumber(lineNumber(), columnNumber());
        enterLoop(whileLoop);
        try {
            ConditionData condition = condition();
            whileLoop.setCondition(condition.condition);
            whileLoop.setParens(condition.lp - i, condition.rp - i);
            AstNode nextStatementAfterInlineComments = getNextStatementAfterInlineComments(whileLoop);
            whileLoop.setLength(getNodeEnd(nextStatementAfterInlineComments) - i);
            restoreRelativeLoopPosition(whileLoop);
            whileLoop.setBody(nextStatementAfterInlineComments);
            return whileLoop;
        } finally {
            exitLoop();
        }
    }

    private WithStatement withStatement() {
        int i;
        if (this.currentToken != 136) {
            codeBug();
        }
        consumeToken();
        Comment andResetJsDoc = getAndResetJsDoc();
        int lineNumber = lineNumber();
        int columnNumber = columnNumber();
        int i2 = this.ts.tokenBeg;
        int i3 = -1;
        if (mustMatchToken(96, "msg.no.paren.with", true)) {
            i = this.ts.tokenBeg;
        } else {
            i = -1;
        }
        AstNode expr = expr(false);
        if (mustMatchToken(97, "msg.no.paren.after.with", true)) {
            i3 = this.ts.tokenBeg;
        }
        WithStatement withStatement = new WithStatement(i2);
        AstNode nextStatementAfterInlineComments = getNextStatementAfterInlineComments(withStatement);
        withStatement.setLength(getNodeEnd(nextStatementAfterInlineComments) - i2);
        withStatement.setJsDocNode(andResetJsDoc);
        withStatement.setExpression(expr);
        withStatement.setStatement(nextStatementAfterInlineComments);
        withStatement.setParens(i, i3);
        withStatement.setLineColumnNumber(lineNumber, columnNumber);
        return withStatement;
    }

    private XmlElemRef xmlElemRef(int i, Name name, int i2) {
        int i3;
        int i4 = this.ts.tokenBeg;
        int i5 = -1;
        if (i != -1) {
            i3 = i;
        } else {
            i3 = i4;
        }
        AstNode expr = expr(false);
        int nodeEnd = getNodeEnd(expr);
        if (mustMatchToken(93, "msg.no.bracket.index", true)) {
            TokenStream tokenStream = this.ts;
            i5 = tokenStream.tokenBeg;
            nodeEnd = tokenStream.tokenEnd;
        }
        XmlElemRef xmlElemRef = new XmlElemRef(i3, nodeEnd - i3);
        xmlElemRef.setNamespace(name);
        xmlElemRef.setColonPos(i2);
        xmlElemRef.setAtPos(i);
        xmlElemRef.setExpression(expr);
        xmlElemRef.setBrackets(i4, i5);
        return xmlElemRef;
    }

    private AstNode xmlInitializer() {
        AstNode expr;
        if (this.currentToken != 14) {
            codeBug();
        }
        TokenStream tokenStream = this.ts;
        int i = tokenStream.tokenBeg;
        int firstXMLToken = tokenStream.getFirstXMLToken();
        if (firstXMLToken != 159 && firstXMLToken != 162) {
            reportError("msg.syntax");
            return makeErrorNode();
        }
        XmlLiteral xmlLiteral = new XmlLiteral(i);
        xmlLiteral.setLineColumnNumber(lineNumber(), columnNumber());
        while (firstXMLToken == 159) {
            TokenStream tokenStream2 = this.ts;
            xmlLiteral.addFragment(new XmlString(tokenStream2.tokenBeg, tokenStream2.getString()));
            mustMatchToken(94, "msg.syntax", true);
            int i2 = this.ts.tokenBeg;
            if (peekToken() == 95) {
                expr = new EmptyExpression(i2, this.ts.tokenEnd - i2);
            } else {
                expr = expr(false);
            }
            mustMatchToken(95, "msg.syntax", true);
            XmlExpression xmlExpression = new XmlExpression(i2, expr);
            xmlExpression.setIsXmlAttribute(this.ts.isXMLAttribute());
            xmlExpression.setLength(this.ts.tokenEnd - i2);
            xmlLiteral.addFragment(xmlExpression);
            firstXMLToken = this.ts.getNextXMLToken();
        }
        if (firstXMLToken != 162) {
            reportError("msg.syntax");
            return makeErrorNode();
        }
        TokenStream tokenStream3 = this.ts;
        xmlLiteral.addFragment(new XmlString(tokenStream3.tokenBeg, tokenStream3.getString()));
        return xmlLiteral;
    }

    public void addError(String str, String str2, int i, int i2) {
        this.syntaxErrorCount++;
        String lookupMessage = lookupMessage(str, str2);
        IdeErrorReporter ideErrorReporter = this.errorCollector;
        if (ideErrorReporter != null) {
            ideErrorReporter.error(lookupMessage, this.sourceURI, i, i2);
        } else {
            this.errorReporter.error(lookupMessage, this.sourceURI, this.currentPos.getLineno(), this.currentPos.getLine(), this.currentPos.getOffset());
        }
    }

    public void addStrictWarning(String str, String str2) {
        addStrictWarning(str, str2, this.currentPos.getPosition(), this.currentPos.getLength());
    }

    public void addWarning(String str, String str2, int i, int i2) {
        String lookupMessage = lookupMessage(str, str2);
        if (this.compilerEnv.reportWarningAsError()) {
            addError(str, str2, i, i2);
            return;
        }
        IdeErrorReporter ideErrorReporter = this.errorCollector;
        if (ideErrorReporter != null) {
            ideErrorReporter.warning(lookupMessage, this.sourceURI, i, i2);
        } else {
            this.errorReporter.warning(lookupMessage, this.sourceURI, this.currentPos.getLineno(), this.currentPos.getLine(), this.currentPos.getOffset());
        }
    }

    public void checkActivationName(String str, int i) {
        if (insideFunctionBody()) {
            if (("arguments".equals(str) && ((FunctionNode) this.currentScriptOrFn).getFunctionType() != 4) || ((this.compilerEnv.getActivationNames() != null && this.compilerEnv.getActivationNames().contains(str)) || ("length".equals(str) && i == 33 && this.compilerEnv.getLanguageVersion() == 120))) {
                setRequiresActivation();
            }
        }
    }

    public void checkMutableReference(Node node) {
        if ((node.getIntProp(16, 0) & 4) != 0) {
            reportError("msg.bad.assign.left");
        }
    }

    public Node createDestructuringAssignment(int i, Node node, Node node2, AstNode astNode, Transformer transformer) {
        String nextTempName = this.currentScriptOrFn.getNextTempName();
        Node destructuringAssignmentHelper = destructuringAssignmentHelper(i, node, node2, nextTempName, astNode, transformer);
        destructuringAssignmentHelper.getLastChild().addChildToBack(createName(nextTempName));
        return destructuringAssignmentHelper;
    }

    public Node createName(int i, String str, Node node) {
        Node createName = createName(str);
        createName.setType(i);
        if (node != null) {
            createName.addChildToBack(node);
        }
        return createName;
    }

    public Node createNumber(double d) {
        return Node.newNumber(d);
    }

    public PerFunctionVariables createPerFunctionVariables(FunctionNode functionNode) {
        return new PerFunctionVariables(functionNode);
    }

    public Scope createScopeNode(int i, int i2, int i3) {
        Scope scope = new Scope();
        scope.setType(i);
        scope.setLineColumnNumber(i2, i3);
        return scope;
    }

    public void defineSymbol(int i, String str, boolean z) {
        org.mozilla.javascript.ast.Symbol symbol;
        int i2;
        if (str == null) {
            if (!this.compilerEnv.isIdeMode()) {
                codeBug();
            } else {
                return;
            }
        }
        Scope definingScope = this.currentScope.getDefiningScope(str);
        if (definingScope != null) {
            symbol = definingScope.getSymbol(str);
        } else {
            symbol = null;
        }
        if (symbol != null) {
            i2 = symbol.getDeclType();
        } else {
            i2 = -1;
        }
        String str2 = "msg.var.redecl";
        if (symbol != null && (i2 == 168 || i == 168 || (definingScope == this.currentScope && i2 == 167))) {
            if (i2 == 168) {
                str2 = "msg.const.redecl";
            } else if (i2 == 167) {
                str2 = "msg.let.redecl";
            } else if (i2 != 135) {
                if (i2 == 122) {
                    str2 = "msg.fn.redecl";
                } else {
                    str2 = "msg.parm.redecl";
                }
            }
            addError(str2, str);
        } else if (i != 96) {
            if (i != 122 && i != 135) {
                if (i != 167) {
                    if (i != 168) {
                        throw codeBug();
                    }
                } else if (!z && (this.currentScope.getType() == 125 || (this.currentScope instanceof Loop))) {
                    addError("msg.let.decl.not.in.block");
                    return;
                } else {
                    this.currentScope.putSymbol(new org.mozilla.javascript.ast.Symbol(i, str));
                    return;
                }
            }
            if (symbol != null) {
                if (i2 == 135) {
                    addStrictWarning("msg.var.redecl", str);
                    return;
                } else if (i2 == 96) {
                    addStrictWarning("msg.var.hides.arg", str);
                    return;
                } else {
                    return;
                }
            }
            this.currentScriptOrFn.putSymbol(new org.mozilla.javascript.ast.Symbol(i, str));
        } else {
            if (symbol != null) {
                addWarning("msg.dup.parms", str);
            }
            this.currentScriptOrFn.putSymbol(new org.mozilla.javascript.ast.Symbol(i, str));
        }
    }

    public boolean destructuringArray(ArrayLiteral arrayLiteral, int i, String str, Node node, List<String> list, AstNode astNode, Transformer transformer) {
        int i2;
        Node node2;
        boolean z;
        int i3;
        Parser parser = this;
        int i4 = i;
        if (i4 == 168) {
            i2 = Token.SETCONST;
        } else {
            i2 = 8;
        }
        int i5 = i2;
        boolean z2 = false;
        int i6 = 0;
        boolean z3 = true;
        for (AstNode astNode2 : arrayLiteral.getElements()) {
            if (astNode2.getType() == 141) {
                i6++;
            } else {
                Node node3 = new Node(39, parser.createName(str), parser.createNumber(i6));
                if (astNode != null && !z2) {
                    node2 = node;
                    parser.setupDefaultValues(str, node2, astNode, i5, transformer);
                    z = true;
                } else {
                    node2 = node;
                    z = z2;
                }
                if (astNode2.getType() == 44) {
                    String string = astNode2.getString();
                    node2.addChildToBack(new Node(i5, parser.createName(54, string, null), node3));
                    if (i4 != -1) {
                        parser.defineSymbol(i4, string, true);
                        list.add(string);
                    }
                    i3 = i5;
                } else if (astNode2.getType() == 99) {
                    int i7 = i4;
                    int i8 = i5;
                    parser.processDestructuringDefaults(i7, node2, list, (Assignment) astNode2, node3, i8, transformer);
                    i3 = i8;
                } else {
                    i3 = i5;
                    node2.addChildToBack(parser.destructuringAssignmentHelper(i, astNode2, node3, parser.currentScriptOrFn.getNextTempName(), null, transformer));
                }
                i6++;
                parser = this;
                i4 = i;
                z3 = false;
                i5 = i3;
                z2 = z;
            }
        }
        return z3;
    }

    public Node destructuringAssignmentHelper(int i, Node node, Node node2, String str, AstNode astNode, Transformer transformer) {
        Scope createScopeNode = createScopeNode(Token.LETEXPR, node.getLineno(), node.getColumn());
        createScopeNode.addChildToFront(new Node(Token.LET, createName(44, str, node2)));
        try {
            pushScope(createScopeNode);
            boolean z = true;
            defineSymbol(Token.LET, str, true);
            popScope();
            Node node3 = new Node(98);
            createScopeNode.addChildToBack(node3);
            List<String> arrayList = new ArrayList<>();
            if (node instanceof ArrayLiteral) {
                z = destructuringArray((ArrayLiteral) node, i, str, node3, arrayList, astNode, transformer);
            } else if (node instanceof ObjectLiteral) {
                z = destructuringObject((ObjectLiteral) node, i, str, node3, arrayList, astNode, transformer);
            } else if (node.getType() != 33 && node.getType() != 39) {
                reportError("msg.bad.assign.left");
            } else {
                if (i == 135 || i == 167 || i == 168) {
                    reportError("msg.bad.assign.left");
                }
                node3.addChildToBack(simpleAssignment(node, createName(str), transformer));
            }
            if (z) {
                node3.addChildToBack(createNumber(0.0d));
            }
            createScopeNode.putProp(22, arrayList);
            return createScopeNode;
        } catch (Throwable th) {
            popScope();
            throw th;
        }
    }

    public boolean destructuringObject(ObjectLiteral objectLiteral, int i, String str, Node node, List<String> list, AstNode astNode, Transformer transformer) {
        int i2;
        int i3;
        int i4;
        Node node2;
        Node node3;
        int i5;
        int i6 = i;
        String str2 = str;
        if (i6 == 168) {
            i2 = Token.SETCONST;
        } else {
            i2 = 8;
        }
        int i7 = i2;
        boolean z = false;
        boolean z2 = true;
        for (ObjectProperty objectProperty : objectLiteral.getElements()) {
            if (this.ts != null) {
                i3 = lineNumber();
                i4 = columnNumber();
            } else {
                i3 = 0;
                i4 = 0;
            }
            AstNode left = objectProperty.getLeft();
            if (left instanceof Name) {
                node2 = new Node(33, createName(str2), Node.newString(((Name) left).getIdentifier()));
            } else if (left instanceof StringLiteral) {
                node2 = new Node(33, createName(str2), Node.newString(((StringLiteral) left).getValue()));
            } else if (left instanceof NumberLiteral) {
                node2 = new Node(39, createName(str2), createNumber((int) ((NumberLiteral) left).getNumber()));
            } else if (left instanceof ComputedPropertyKey) {
                reportError("msg.bad.computed.property.in.destruct");
                return false;
            } else {
                throw codeBug();
            }
            Node node4 = node2;
            node4.setLineColumnNumber(i3, i4);
            if (astNode != null && !z) {
                node3 = node;
                setupDefaultValues(str2, node3, astNode, i7, transformer);
                z = true;
            } else {
                node3 = node;
            }
            AstNode right = objectProperty.getRight();
            if (right.getType() == 44) {
                String identifier = ((Name) right).getIdentifier();
                node3.addChildToBack(new Node(i7, createName(54, identifier, null), node4));
                if (i6 != -1) {
                    defineSymbol(i6, identifier, true);
                    list.add(identifier);
                }
            } else if (right.getType() == 99) {
                processDestructuringDefaults(i6, node3, list, (Assignment) right, node4, i7, transformer);
            } else {
                i5 = i7;
                node3.addChildToBack(destructuringAssignmentHelper(i, right, node4, this.currentScriptOrFn.getNextTempName(), null, transformer));
                i6 = i;
                str2 = str;
                z2 = false;
                i7 = i5;
            }
            i5 = i7;
            i6 = i;
            str2 = str;
            z2 = false;
            i7 = i5;
        }
        return z2;
    }

    public boolean eof() {
        return this.ts.eof();
    }

    public boolean inUseStrictDirective() {
        return this.inUseStrictDirective;
    }

    public boolean insideFunctionBody() {
        if (this.nestingOfFunction != 0) {
            return true;
        }
        return false;
    }

    public boolean insideFunctionParams() {
        if (this.nestingOfFunctionParams != 0) {
            return true;
        }
        return false;
    }

    public String lookupMessage(String str, String str2) {
        if (str2 == null) {
            return ScriptRuntime.getMessageById(str, new Object[0]);
        }
        return ScriptRuntime.getMessageById(str, str2);
    }

    public void markDestructuring(AstNode astNode) {
        if (astNode instanceof DestructuringForm) {
            ((DestructuringForm) astNode).setIsDestructuring(true);
        } else if (astNode instanceof ParenthesizedExpression) {
            markDestructuring(((ParenthesizedExpression) astNode).getExpression());
        }
    }

    public void popScope() {
        this.currentScope = this.currentScope.getParentScope();
    }

    public void pushScope(Scope scope) {
        Scope parentScope = scope.getParentScope();
        Scope scope2 = this.currentScope;
        if (parentScope != null) {
            if (parentScope != scope2) {
                codeBug();
            }
        } else {
            scope2.addChildScope(scope);
        }
        this.currentScope = scope;
    }

    public AstNode removeParens(AstNode astNode) {
        while (astNode instanceof ParenthesizedExpression) {
            astNode = ((ParenthesizedExpression) astNode).getExpression();
        }
        return astNode;
    }

    public void reportError(String str, String str2, int i, int i2) {
        addError(str, str2, i, i2);
        if (this.compilerEnv.recoverFromErrors()) {
            return;
        }
        throw new ParserException();
    }

    public void reportErrorsIfExists(int i) {
        int i2 = this.syntaxErrorCount;
        if (i2 != 0) {
            String lookupMessage = lookupMessage("msg.got.syntax.errors", String.valueOf(i2));
            if (!this.compilerEnv.isIdeMode()) {
                throw this.errorReporter.runtimeError(lookupMessage, this.sourceURI, i, null, 0);
            }
        }
    }

    public void setDefaultUseStrictDirective(boolean z) {
        this.defaultUseStrictDirective = z;
    }

    public void setIsGenerator() {
        if (insideFunctionBody()) {
            ((FunctionNode) this.currentScriptOrFn).setIsGenerator();
        }
    }

    public void setRequiresActivation() {
        if (insideFunctionBody()) {
            ((FunctionNode) this.currentScriptOrFn).setRequiresActivation();
        }
    }

    public void setSourceURI(String str) {
        this.sourceURI = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.mozilla.javascript.Node] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.mozilla.javascript.ast.AstNode] */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.mozilla.javascript.Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [org.mozilla.javascript.Node] */
    /* JADX WARN: Type inference failed for: r4v7, types: [org.mozilla.javascript.ast.Name] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.mozilla.javascript.Parser$Transformer] */
    public Node simpleAssignment(Node node, Node node2, Transformer transformer) {
        Node firstChild;
        ?? lastChild;
        int i;
        int type = node.getType();
        if (type != 33 && type != 39) {
            if (type != 44) {
                if (type == 73) {
                    Node firstChild2 = node.getFirstChild();
                    checkMutableReference(firstChild2);
                    return new Node(74, firstChild2, node2);
                }
                throw codeBug();
            }
            String identifier = ((Name) node).getIdentifier();
            if (this.inUseStrictDirective && ("eval".equals(identifier) || "arguments".equals(identifier))) {
                reportError("msg.bad.id.strict", identifier);
            }
            node.setType(54);
            return new Node(8, node, node2);
        }
        if (node instanceof PropertyGet) {
            PropertyGet propertyGet = (PropertyGet) node;
            AstNode target = propertyGet.getTarget();
            firstChild = target;
            if (transformer != 0) {
                firstChild = transformer.transform(target);
            }
            lastChild = propertyGet.getProperty();
        } else if (node instanceof ElementGet) {
            ElementGet elementGet = (ElementGet) node;
            AstNode target2 = elementGet.getTarget();
            lastChild = elementGet.getElement();
            firstChild = target2;
            if (transformer != 0) {
                firstChild = transformer.transform(target2);
            }
            if (transformer != 0) {
                lastChild = transformer.transform(lastChild);
            }
        } else {
            firstChild = node.getFirstChild();
            lastChild = node.getLastChild();
        }
        if (type == 33) {
            lastChild.setType(46);
            i = 37;
        } else {
            i = 41;
        }
        return new Node(i, firstChild, (Node) lastChild, node2);
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class ConditionData {
        AstNode condition;
        int lp;
        int rp;

        private ConditionData() {
            this.lp = -1;
            this.rp = -1;
        }

        public /* synthetic */ ConditionData(int i) {
            this();
        }
    }

    public Node createName(String str) {
        checkActivationName(str, 44);
        return Node.newString(44, str);
    }

    public void addStrictWarning(String str, String str2, int i, int i2) {
        if (this.compilerEnv.isStrictMode()) {
            addWarning(str, str2, i, i2);
        }
    }

    private void addStrictWarning(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        if (this.compilerEnv.isStrictMode()) {
            addWarning(str, str2, i, i2, i3, str3, i4);
        }
    }

    private boolean mustMatchToken(int i, String str, int i2, int i3, boolean z) {
        if (matchToken(i, z)) {
            return true;
        }
        reportError(str, i2, i3);
        return false;
    }

    public void reportError(String str, String str2) {
        reportError(str, str2, this.currentPos.getPosition(), this.currentPos.getLength());
    }

    public String lookupMessage(String str) {
        return lookupMessage(str, null);
    }

    public void reportError(String str, int i, int i2) {
        reportError(str, null, i, i2);
    }

    public void reportError(String str) {
        reportError(str, null);
    }

    public Parser(CompilerEnvirons compilerEnvirons) {
        this(compilerEnvirons, compilerEnvirons.getErrorReporter());
    }

    public Node createDestructuringAssignment(int i, Node node, Node node2, Transformer transformer) {
        return createDestructuringAssignment(i, node, node2, null, transformer);
    }

    public Parser() {
        this(new CompilerEnvirons());
    }

    public Node createDestructuringAssignment(int i, Node node, Node node2, AstNode astNode) {
        return createDestructuringAssignment(i, node, node2, astNode, null);
    }

    public void addError(String str, int i, int i2) {
        addError(str, null, i, i2);
    }

    public void addError(String str, String str2) {
        addError(str, str2, this.currentPos.getPosition(), this.currentPos.getLength());
    }

    public void addError(String str, int i) {
        addError(str, Character.toString((char) i));
    }

    public void addError(String str) {
        addError(str, this.currentPos.getPosition(), this.currentPos.getLength());
    }

    private void addError(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        this.syntaxErrorCount++;
        String lookupMessage = lookupMessage(str, str2);
        IdeErrorReporter ideErrorReporter = this.errorCollector;
        if (ideErrorReporter != null) {
            ideErrorReporter.error(lookupMessage, this.sourceURI, i, i2);
        } else {
            this.errorReporter.error(lookupMessage, this.sourceURI, i3, str3, i4);
        }
    }

    public void addWarning(String str, int i, int i2) {
        addWarning(str, null, i, i2);
    }

    public void addWarning(String str, String str2) {
        addWarning(str, str2, this.currentPos.getPosition(), this.currentPos.getLength());
    }

    private void addWarning(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        String lookupMessage = lookupMessage(str, str2);
        if (this.compilerEnv.reportWarningAsError()) {
            addError(str, str2, i, i2, i3, str3, i4);
            return;
        }
        IdeErrorReporter ideErrorReporter = this.errorCollector;
        if (ideErrorReporter != null) {
            ideErrorReporter.warning(lookupMessage, this.sourceURI, i, i2);
        } else {
            this.errorReporter.warning(lookupMessage, this.sourceURI, i3, str3, i4);
        }
    }

    private AstNode statements() {
        return statements(null);
    }

    private Name createNameNode() {
        return createNameNode(false, 44);
    }

    private AstNode generatorExpression(AstNode astNode, int i) {
        return generatorExpression(astNode, i, false);
    }

    public Node simpleAssignment(Node node, Node node2) {
        return simpleAssignment(node, node2, null);
    }

    public void defineSymbol(int i, String str) {
        defineSymbol(i, str, false);
    }

    @Deprecated
    public AstRoot parse(Reader reader, String str, int i) {
        if (!this.parseFinished) {
            if (this.compilerEnv.isIdeMode()) {
                return parse(Kit.readReader(reader), str, i);
            }
            try {
                this.sourceURI = str;
                TokenStream tokenStream = new TokenStream(this, reader, null, i);
                this.ts = tokenStream;
                this.currentPos = tokenStream;
                return parse();
            } finally {
                this.parseFinished = true;
            }
        }
        vs.k("parser reused");
        return null;
    }

    public AstRoot parse(String str, String str2, int i) {
        if (!this.parseFinished) {
            this.sourceURI = str2;
            if (this.compilerEnv.isIdeMode()) {
                this.sourceChars = str.toCharArray();
            }
            TokenStream tokenStream = new TokenStream(this, null, str, i);
            this.ts = tokenStream;
            this.currentPos = tokenStream;
            try {
                try {
                    return parse();
                } catch (IOException unused) {
                    throw new IllegalStateException();
                }
            } finally {
                this.parseFinished = true;
            }
        }
        vs.k("parser reused");
        return null;
    }

    private FunctionNode function(int i) {
        return function(i, false);
    }
}
