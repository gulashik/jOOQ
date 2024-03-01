/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.references


import jooq.generated.tables.Author
import jooq.generated.tables.BankTransaction
import jooq.generated.tables.Book
import jooq.generated.tables.BookStore
import jooq.generated.tables.BookToBookStore
import jooq.generated.tables.Customer
import jooq.generated.tables.CustomerMaster
import jooq.generated.tables.Customerdetail
import jooq.generated.tables.DailyActivity
import jooq.generated.tables.Department
import jooq.generated.tables.Each
import jooq.generated.tables.Employee
import jooq.generated.tables.EmployeeStatus
import jooq.generated.tables.GetOfficesMultiple
import jooq.generated.tables.Language
import jooq.generated.tables.Office
import jooq.generated.tables.OfficeFlights
import jooq.generated.tables.OfficeHasManager
import jooq.generated.tables.OfficeMaster
import jooq.generated.tables.Order
import jooq.generated.tables.Orderdetail
import jooq.generated.tables.Payment
import jooq.generated.tables.PgpArmorHeaders
import jooq.generated.tables.Product
import jooq.generated.tables.ProductMaster
import jooq.generated.tables.ProductOfProductLine
import jooq.generated.tables.Productline
import jooq.generated.tables.Productlinedetail
import jooq.generated.tables.Sale
import jooq.generated.tables.Skeys
import jooq.generated.tables.Svals
import jooq.generated.tables.Token
import jooq.generated.tables.Top3product
import jooq.generated.tables.TopThreeSalesPerEmployee
import jooq.generated.tables.Weekday
import jooq.generated.tables.records.EachRecord
import jooq.generated.tables.records.GetOfficesMultipleRecord
import jooq.generated.tables.records.PgpArmorHeadersRecord
import jooq.generated.tables.records.ProductOfProductLineRecord
import jooq.generated.tables.records.SkeysRecord
import jooq.generated.tables.records.SvalsRecord
import jooq.generated.tables.records.TopThreeSalesPerEmployeeRecord

import org.jooq.Configuration
import org.jooq.Field
import org.jooq.Result



/**
 * The table <code>public.author</code>.
 */
val AUTHOR: Author = Author.AUTHOR

/**
 * The table <code>public.bank_transaction</code>.
 */
val BANK_TRANSACTION: BankTransaction = BankTransaction.BANK_TRANSACTION

/**
 * The table <code>public.book</code>.
 */
val BOOK: Book = Book.BOOK

/**
 * The table <code>public.book_store</code>.
 */
val BOOK_STORE: BookStore = BookStore.BOOK_STORE

/**
 * The table <code>public.book_to_book_store</code>.
 */
val BOOK_TO_BOOK_STORE: BookToBookStore = BookToBookStore.BOOK_TO_BOOK_STORE

/**
 * The table <code>public.customer</code>.
 */
val CUSTOMER: Customer = Customer.CUSTOMER

/**
 * The table <code>public.customer_master</code>.
 */
val CUSTOMER_MASTER: CustomerMaster = CustomerMaster.CUSTOMER_MASTER

/**
 * The table <code>public.customerdetail</code>.
 */
val CUSTOMERDETAIL: Customerdetail = Customerdetail.CUSTOMERDETAIL

/**
 * The table <code>public.daily_activity</code>.
 */
val DAILY_ACTIVITY: DailyActivity = DailyActivity.DAILY_ACTIVITY

/**
 * The table <code>public.department</code>.
 */
val DEPARTMENT: Department = Department.DEPARTMENT

/**
 * The table <code>public.each</code>.
 */
val EACH: Each = Each.EACH
@Deprecated(message = "Unknown data type. Parameter type or return type is unknown. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
fun EACH(
      configuration: Configuration
    , hs: Any?
): Result<EachRecord> = configuration.dsl().selectFrom(jooq.generated.tables.Each.EACH.call(
      hs
)).fetch()
@Deprecated(message = "Unknown data type. Parameter type or return type is unknown. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
fun EACH(
      hs: Any?
): Each = jooq.generated.tables.Each.EACH.call(
    hs
)
@Deprecated(message = "Unknown data type. Parameter type or return type is unknown. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
fun EACH(
      hs: Field<Any?>
): Each = jooq.generated.tables.Each.EACH.call(
    hs
)

/**
 * The table <code>public.employee</code>.
 */
val EMPLOYEE: Employee = Employee.EMPLOYEE

/**
 * The table <code>public.employee_status</code>.
 */
val EMPLOYEE_STATUS: EmployeeStatus = EmployeeStatus.EMPLOYEE_STATUS

/**
 * The table <code>public.get_offices_multiple</code>.
 */
val GET_OFFICES_MULTIPLE: GetOfficesMultiple = GetOfficesMultiple.GET_OFFICES_MULTIPLE

/**
 * Call <code>public.get_offices_multiple</code>.
 */
fun GET_OFFICES_MULTIPLE(
      configuration: Configuration
): Result<GetOfficesMultipleRecord> = configuration.dsl().selectFrom(jooq.generated.tables.GetOfficesMultiple.GET_OFFICES_MULTIPLE.call(
)).fetch()

/**
 * Get <code>public.get_offices_multiple</code> as a table.
 */
fun GET_OFFICES_MULTIPLE(): GetOfficesMultiple = jooq.generated.tables.GetOfficesMultiple.GET_OFFICES_MULTIPLE.call(
)

/**
 * The table <code>public.language</code>.
 */
val LANGUAGE: Language = Language.LANGUAGE

/**
 * The table <code>public.office</code>.
 */
val OFFICE: Office = Office.OFFICE

/**
 * The table <code>public.office_flights</code>.
 */
val OFFICE_FLIGHTS: OfficeFlights = OfficeFlights.OFFICE_FLIGHTS

/**
 * The table <code>public.office_has_manager</code>.
 */
val OFFICE_HAS_MANAGER: OfficeHasManager = OfficeHasManager.OFFICE_HAS_MANAGER

/**
 * The table <code>public.office_master</code>.
 */
val OFFICE_MASTER: OfficeMaster = OfficeMaster.OFFICE_MASTER

/**
 * The table <code>public.order</code>.
 */
val ORDER: Order = Order.ORDER

/**
 * The table <code>public.orderdetail</code>.
 */
val ORDERDETAIL: Orderdetail = Orderdetail.ORDERDETAIL

/**
 * The table <code>public.payment</code>.
 */
val PAYMENT: Payment = Payment.PAYMENT

/**
 * The table <code>public.pgp_armor_headers</code>.
 */
val PGP_ARMOR_HEADERS: PgpArmorHeaders = PgpArmorHeaders.PGP_ARMOR_HEADERS

/**
 * Call <code>public.pgp_armor_headers</code>.
 */
fun PGP_ARMOR_HEADERS(
      configuration: Configuration
    , __1: String?
): Result<PgpArmorHeadersRecord> = configuration.dsl().selectFrom(jooq.generated.tables.PgpArmorHeaders.PGP_ARMOR_HEADERS.call(
      __1
)).fetch()

/**
 * Get <code>public.pgp_armor_headers</code> as a table.
 */
fun PGP_ARMOR_HEADERS(
      __1: String?
): PgpArmorHeaders = jooq.generated.tables.PgpArmorHeaders.PGP_ARMOR_HEADERS.call(
    __1
)

/**
 * Get <code>public.pgp_armor_headers</code> as a table.
 */
fun PGP_ARMOR_HEADERS(
      __1: Field<String?>
): PgpArmorHeaders = jooq.generated.tables.PgpArmorHeaders.PGP_ARMOR_HEADERS.call(
    __1
)

/**
 * The table <code>public.product</code>.
 */
val PRODUCT: Product = Product.PRODUCT

/**
 * The table <code>public.product_master</code>.
 */
val PRODUCT_MASTER: ProductMaster = ProductMaster.PRODUCT_MASTER

/**
 * The table <code>public.product_of_product_line</code>.
 */
val PRODUCT_OF_PRODUCT_LINE: ProductOfProductLine = ProductOfProductLine.PRODUCT_OF_PRODUCT_LINE

/**
 * Call <code>public.product_of_product_line</code>.
 */
fun PRODUCT_OF_PRODUCT_LINE(
      configuration: Configuration
    , pLineIn: String?
): Result<ProductOfProductLineRecord> = configuration.dsl().selectFrom(jooq.generated.tables.ProductOfProductLine.PRODUCT_OF_PRODUCT_LINE.call(
      pLineIn
)).fetch()

/**
 * Get <code>public.product_of_product_line</code> as a table.
 */
fun PRODUCT_OF_PRODUCT_LINE(
      pLineIn: String?
): ProductOfProductLine = jooq.generated.tables.ProductOfProductLine.PRODUCT_OF_PRODUCT_LINE.call(
    pLineIn
)

/**
 * Get <code>public.product_of_product_line</code> as a table.
 */
fun PRODUCT_OF_PRODUCT_LINE(
      pLineIn: Field<String?>
): ProductOfProductLine = jooq.generated.tables.ProductOfProductLine.PRODUCT_OF_PRODUCT_LINE.call(
    pLineIn
)

/**
 * The table <code>public.productline</code>.
 */
val PRODUCTLINE: Productline = Productline.PRODUCTLINE

/**
 * The table <code>public.productlinedetail</code>.
 */
val PRODUCTLINEDETAIL: Productlinedetail = Productlinedetail.PRODUCTLINEDETAIL

/**
 * The table <code>public.sale</code>.
 */
val SALE: Sale = Sale.SALE

/**
 * The table <code>public.skeys</code>.
 */
val SKEYS: Skeys = Skeys.SKEYS
@Deprecated(message = "Unknown data type. Parameter type or return type is unknown. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
fun SKEYS(
      configuration: Configuration
    , __1: Any?
): Result<SkeysRecord> = configuration.dsl().selectFrom(jooq.generated.tables.Skeys.SKEYS.call(
      __1
)).fetch()
@Deprecated(message = "Unknown data type. Parameter type or return type is unknown. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
fun SKEYS(
      __1: Any?
): Skeys = jooq.generated.tables.Skeys.SKEYS.call(
    __1
)
@Deprecated(message = "Unknown data type. Parameter type or return type is unknown. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
fun SKEYS(
      __1: Field<Any?>
): Skeys = jooq.generated.tables.Skeys.SKEYS.call(
    __1
)

/**
 * The table <code>public.svals</code>.
 */
val SVALS: Svals = Svals.SVALS
@Deprecated(message = "Unknown data type. Parameter type or return type is unknown. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
fun SVALS(
      configuration: Configuration
    , __1: Any?
): Result<SvalsRecord> = configuration.dsl().selectFrom(jooq.generated.tables.Svals.SVALS.call(
      __1
)).fetch()
@Deprecated(message = "Unknown data type. Parameter type or return type is unknown. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
fun SVALS(
      __1: Any?
): Svals = jooq.generated.tables.Svals.SVALS.call(
    __1
)
@Deprecated(message = "Unknown data type. Parameter type or return type is unknown. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
fun SVALS(
      __1: Field<Any?>
): Svals = jooq.generated.tables.Svals.SVALS.call(
    __1
)

/**
 * The table <code>public.token</code>.
 */
val TOKEN: Token = Token.TOKEN

/**
 * The table <code>public.top3product</code>.
 */
val TOP3PRODUCT: Top3product = Top3product.TOP3PRODUCT

/**
 * The table <code>public.top_three_sales_per_employee</code>.
 */
val TOP_THREE_SALES_PER_EMPLOYEE: TopThreeSalesPerEmployee = TopThreeSalesPerEmployee.TOP_THREE_SALES_PER_EMPLOYEE

/**
 * Call <code>public.top_three_sales_per_employee</code>.
 */
fun TOP_THREE_SALES_PER_EMPLOYEE(
      configuration: Configuration
    , employeeNr: Long?
): Result<TopThreeSalesPerEmployeeRecord> = configuration.dsl().selectFrom(jooq.generated.tables.TopThreeSalesPerEmployee.TOP_THREE_SALES_PER_EMPLOYEE.call(
      employeeNr
)).fetch()

/**
 * Get <code>public.top_three_sales_per_employee</code> as a table.
 */
fun TOP_THREE_SALES_PER_EMPLOYEE(
      employeeNr: Long?
): TopThreeSalesPerEmployee = jooq.generated.tables.TopThreeSalesPerEmployee.TOP_THREE_SALES_PER_EMPLOYEE.call(
    employeeNr
)

/**
 * Get <code>public.top_three_sales_per_employee</code> as a table.
 */
fun TOP_THREE_SALES_PER_EMPLOYEE(
      employeeNr: Field<Long?>
): TopThreeSalesPerEmployee = jooq.generated.tables.TopThreeSalesPerEmployee.TOP_THREE_SALES_PER_EMPLOYEE.call(
    employeeNr
)

/**
 * The table <code>public.weekday</code>.
 */
val WEEKDAY: Weekday = Weekday.WEEKDAY